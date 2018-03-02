package com.xinqushi.controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xinqushi.common.pojo.CommentInfo;
import com.xinqushi.common.pojo.EUDataGridResult;
import com.xinqushi.common.pojo.SummaryComment;
import com.xinqushi.common.pojo.SummaryInfo;
import com.xinqushi.entity.Summary;
import com.xinqushi.service.SummaryService;
import com.xinqushi.utils.CookieUtils;
import com.xinqushi.utils.JsonUtils;
import com.xinqushi.utils.MemberResult;

import net.minidev.json.JSONObject;



@Controller
public class SummaryController {
    @Value("${SUMMARY_LIST2_ROWS}")
    private int SUMMARY_LIST2_ROWS;
    @Autowired
    private SummaryService summaryService;
    
    // 保存周报
    @RequestMapping(value="/summary/save")
    @ResponseBody
    public String  weeklySave(@RequestParam String contents, HttpServletResponse response, HttpServletRequest request) throws IOException {
        MemberResult result=null;
        if(contents!=null) {
            result = summaryService.saveSummary(contents,request);
        }
        PrintWriter out = response.getWriter();
        if(result !=null) {
            if(result.getStatus() == 200) {
                out.print("1");
            }else if(result.getStatus() == 300){
                out.print("2");
            }else {
                out.println("3");
            }
        }else {
            out.println("3");
        }
        return null;
        
    }
    
    // 获取周报
    @RequestMapping(value="/summary/getCurrentSummary")
    @ResponseBody
    public String getCurrentSummary( HttpServletRequest request) throws IOException {
        MemberResult result=summaryService.getCurrentSummary(request);
        if(result.getStatus() == 200) {
            String json = JsonUtils.objectToJson(result.getData());
            Summary summary = JsonUtils.jsonToPojo(json, Summary.class);
            String content = summary.getContent();
            return content;
        }
        return null;
    }
    
    // 将登录失效时已编辑好但未保存的周报存入session
    @RequestMapping(value="/summary/saveTextIntoSession")
    @ResponseBody
    public String saveTextIntoSession( HttpSession session, @RequestParam String summary) throws IOException {
        session.setAttribute("summary", summary);
        return null;
    }
    // 从session取得登录失效时已编辑好但未保存的周报
    @RequestMapping(value="/summary/getTextIntoSession")
    @ResponseBody
    public String getTextIntoSession( HttpSession session, HttpServletResponse response) throws IOException {
        String  summary = (String) session.getAttribute("summary");
        PrintWriter out = response.getWriter();
        if(summary != null) {
            //将返回的string的格式转换成iso8859-1，因为springmvc处理字符串编码为ISO-8859-1
            summary=new String(summary.getBytes("utf-8"),"iso8859-1");
            out.print(summary);
        }
        return null;
    }
    
    // 获取我的周报列表
    @RequestMapping(value="/summary/getSummaryList")
    @ResponseBody
    public String  getSummaryList(@RequestParam int page, HttpServletRequest request) throws IOException {
        int rows = SUMMARY_LIST2_ROWS;
        EUDataGridResult result=summaryService.getSummaryList(page, request,rows);
        if(result == null) {
            return "0";
        }
        String summarys = JsonUtils.objectToJson(result);
        return summarys;
    }
    
    // 获取我的周报导航键
    @RequestMapping("/summary/getNavigation")
    @ResponseBody
    public String getNavigation (@RequestParam int page, HttpServletRequest request) throws IOException {
        String summarys = getSummaryList(page, request);
        EUDataGridResult result = JsonUtils.jsonToPojo(summarys, EUDataGridResult.class);
        List<?> list = result.getRows();
        int PageCount =(int) (result.getTotal() / SUMMARY_LIST2_ROWS);
        if(result.getTotal() % SUMMARY_LIST2_ROWS != 0) {
            PageCount++;
        }
        int btns=5;
        btns=btns / 2;
        int start=page-btns;
        int end=page+btns;
        if(start<1) {
            start=1;
            end=start+btns*2;
        }
        if(end>PageCount) {
            end=PageCount;
            start=end-btns*2;
            if(start<1) {
                start=1;
            }
        }
        StringBuilder str=new StringBuilder(); //建立一个有append方法的字符串对象
        str.append("<a href='javascript:void(0)' onclick='show("+1+")'>");
        str.append("第一页");
        str.append("</a>");
        str.append("&nbsp;&nbsp;");
        str.append("<a href='javascript:void(0)' onclick='show("+(page-1)+")'>");
        str.append("<");
        str.append("</a>");
        str.append("&nbsp;&nbsp;&nbsp;&nbsp;");
        for(int i=start;i<=end;i++) {
            if(i==page) {   //若为当前页，无超链接
                str.append("<font color='red'><b>");
                str.append(i); 
                str.append("</b></font>");
                str.append("&nbsp;&nbsp;");
            }else {
                str.append("<a href='javascript:void(0)' onclick='show("+i+")'>");
                str.append(i);
                str.append("</a>");
                str.append("&nbsp;&nbsp;");
            }
        }
        str.append("&nbsp;&nbsp;");
        str.append("<a href='javascript:void(0)' onclick='show("+(page+1)+")'>");
        str.append(">");
        str.append("</a>");
        str.append("&nbsp;&nbsp;");
        str.append("<a href='javascript:void(0)' onclick='show("+PageCount+")'>");
        str.append("最后一页");
        str.append("</a>");
        str.append("&nbsp;&nbsp;");
        str.append("<br/>");
        return str.toString();
    }
    
    // 通州周报id获取周报
    @RequestMapping("/summary/getSummaryById")
    @ResponseBody
    public String getSummaryById(@RequestParam int id, HttpServletRequest request) {
        SummaryInfo summaryById = summaryService.getSummaryById(id, request);
        String summary = JsonUtils.objectToJson(summaryById);
        return summary;
    }
    
    // 通过周报id和comment保存周报评论
    @RequestMapping("/summary/addComment")
    @ResponseBody
    public String  addComment(@RequestParam String comment,@RequestParam int sumid, HttpServletRequest request) {
        MemberResult result = summaryService.addComment(comment, sumid, request);
        if(result != null) {
            return "1";
        }
        return "0";
    }
    
    // 通过周报id获取评论
    @RequestMapping("/summary/getComment")
    @ResponseBody
    public String  getComment(@RequestParam int sumid) {
        List<CommentInfo> result = summaryService.getComment(sumid);
        if(result != null) {
            String json = JsonUtils.objectToJson(result);
            return json;
        }
        return null;
    }
    
    // 获得当前用户下一周周报
    @RequestMapping("/summary/getNextSummaryIdByUserId")
    @ResponseBody
    public String getNextSummaryIdByUserId(HttpServletRequest request, @RequestParam int sumid) {
        String string= summaryService.getNextSummaryIdByUserId(request, sumid);
        return string;
    }
    // 获得当前用户上一周周报
    @RequestMapping("/summary/getPreSummaryIdByUserId")
    @ResponseBody
    public String getPreSummaryIdByUserId(HttpServletRequest request, @RequestParam int sumid) {
        String string= summaryService.getPreSummaryIdByUserId(request, sumid);
        return string;
    }    
    // 获得当前用户最新周报
    @RequestMapping("/summary/getCurrentSummaryIdByUserId")
    @ResponseBody
    public String getCurrentSummaryIdByUserId(HttpServletRequest request) {
        String string= summaryService.getCurrentSummaryIdByUserId(request);
        return string;
    }    
    // 获得当前用户第一周周报
    @RequestMapping("/summary/getFirstSummaryIdByUserId")
    @ResponseBody
    public String getFirstSummaryIdByUserId(HttpServletRequest request) {
        String string= summaryService.getFirstSummaryIdByUserId(request);
        return string;
    }
    
//    // 获得有搜索条件的周报列表
//    @RequestMapping(value="/summary/getAllSummaryList")
//    @ResponseBody
//    public String  getSummaryList(@RequestParam int page, @RequestParam String checkType, 
//            @RequestParam String ownerType, @RequestParam String weekType) throws IOException {
//        int rows = SUMMARY_LIST2_ROWS;
//        EUDataGridResult result=summaryService.getSummaryList(page, request,rows);
//        if(result == null) {
//            return "0";
//        }
//        String summarys = JsonUtils.objectToJson(result);
//        return summarys;
//    }
}
