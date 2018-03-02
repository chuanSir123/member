package com.xinqushi.controller;

import java.io.UnsupportedEncodingException;


import java.net.URLDecoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
import com.xinqushi.utils.MemberResult;

@Controller
public class SummaryController {
    @Autowired
    private SummaryService summaryService;
    
    @RequestMapping("/summary/save")
    @ResponseBody
    public MemberResult saveSummary(@RequestParam String contents, @RequestParam String token) throws UnsupportedEncodingException {
        // 防止存入数据库时中文乱码
        contents=URLDecoder.decode(contents,"utf-8");
        MemberResult result = summaryService.summarySave(token, contents);
        return result;
    }
    
    @RequestMapping("/summary/getCurrentSummary")
    @ResponseBody
    public MemberResult currentSummaryGet(@RequestParam String token) throws UnsupportedEncodingException {
        MemberResult result = summaryService.currentSummaryGet(token);
        return result;
    }
    
    @RequestMapping("/summary/getSummaryList")
    @ResponseBody
    public EUDataGridResult getItemList(@RequestParam int page, @RequestParam String token, @RequestParam String rows) {
        EUDataGridResult result=summaryService.summaryListGet(page, token, rows);
        return result;
    }
    
    @RequestMapping("/summary/getSummaryById")
    @ResponseBody
    public SummaryInfo getSummaryById(@RequestParam int id,@RequestParam String token) {
        SummaryInfo summaryById = summaryService.summaryByIdGet(id,token);
        return summaryById;
    }
    
    @RequestMapping("/summary/addComment")
    @ResponseBody
    public MemberResult commentAdd(@RequestParam String comment,@RequestParam int sumid,@RequestParam String token) {
        MemberResult result = summaryService.commentAdd(comment, sumid, token);
        return result;
    }
    
    @RequestMapping("/summary/getComment")
    @ResponseBody
    public List<CommentInfo> commentGet(@RequestParam int sumid) {
        List<CommentInfo> result = summaryService.commentGet(sumid);
        return result;
    }
    
    @RequestMapping("/summary/getNextSummaryIdByUserId")
    @ResponseBody
    public String getNextSummaryIdByUserId(@RequestParam String token, @RequestParam int sumid) {
        String string= summaryService.getNextSummaryIdByUserId(token, sumid);
        return string;
    }
    @RequestMapping("/summary/getPreSummaryIdByUserId")
    @ResponseBody
    public String getPreSummaryIdByUserId(@RequestParam String token, @RequestParam int sumid) {
        String string= summaryService.getPreSummaryIdByUserId(token, sumid);
        return string;
    }
    @RequestMapping("/summary/getCurrentSummaryIdByUserId")
    @ResponseBody
    public String getCurrentSummaryIdByUserId(@RequestParam String token) {
        String string= summaryService.getCurrentSummaryIdByUserId(token);
        return string;
    }
    @RequestMapping("/summary/getFirstSummaryIdByUserId")
    @ResponseBody
    public String getFirstSummaryIdByUserId(@RequestParam String token) {
        String string= summaryService.getFirstSummaryIdByUserId(token);
        return string;
    }
}
