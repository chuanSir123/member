package com.xinqushi.service.impl;

import java.io.UnsupportedEncodingException;


import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.xinqushi.common.pojo.CommentInfo;
import com.xinqushi.common.pojo.EUDataGridResult;
import com.xinqushi.common.pojo.SummaryComment;
import com.xinqushi.common.pojo.SummaryInfo;
import com.xinqushi.entity.Summary;
import com.xinqushi.service.SummaryService;
import com.xinqushi.utils.CookieUtils;
import com.xinqushi.utils.HttpClientUtil;
import com.xinqushi.utils.JsonUtils;
import com.xinqushi.utils.MemberResult;
@Service
public class SummaryServiceImpl implements SummaryService {
    @Value("${Background_BASE_URL}")
    private String Background_BASE_URL;
    @Value("${SUMMARY_SAVE_URL}")
    private String SUMMARY_SAVE_URL;
    @Value("${COOKIE_TOKEN_KEY}")
    private String COOKIE_TOKEN_KEY;
    @Value("${SUMMARY_GET_URL}")
    private String SUMMARY_GET_URL;
    @Value("${SUMMARY_LIST_URL}")
    private String SUMMARY_LIST_URL;
    @Value("${SUMMARY_ID_URL}")
    private String SUMMARY_ID_URL;
    @Value("${SUMMARY_SAVECOMMENT_URL}")
    private String SUMMARY_SAVECOMMENT_URL;
    @Value("${SUMMARY_GETCOMMENT_URL}")
    private String SUMMARY_GETCOMMENT_URL;
    @Value("${SUMMARY_PRE_URL}")
    private String SUMMARY_PRE_URL;
    @Value("${SUMMARY_NEXT_URL}")
    private String SUMMARY_NEXT_URL;
    @Value("${SUMMARY_NOW_URL}")
    private String SUMMARY_NOW_URL;
    @Value("${SUMMARY_FIRST_URL}")
    private String SUMMARY_FIRST_URL;
    
    /*
     * (保存及修改周报)
     * @see com.xinqushi.service.SummaryService#saveSummary(java.lang.String, javax.servlet.http.HttpServletRequest)
     */
    @Override
    public MemberResult saveSummary(String contents, HttpServletRequest request) {
        // 从cookie获取token
        String token = CookieUtils.getCookieValue(request, COOKIE_TOKEN_KEY);
        Map<String , String > map=new HashMap<>();
        try {
            contents=URLEncoder.encode(contents,"utf-8");
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        map.put("contents", contents);
        map.put("token", token);
        // 调用Background系统接口，保存周报
        String jsonData = HttpClientUtil.doPost(Background_BASE_URL+SUMMARY_SAVE_URL,map);
        MemberResult memberResult = MemberResult.formatToPojo(jsonData, MemberResult.class);
        return memberResult;
    }
    
    /*
     * (获取已保存周报内容)
     * @see com.xinqushi.service.SummaryService#getCurrentSummary(javax.servlet.http.HttpServletRequest)
     */
    @Override
    public MemberResult getCurrentSummary(HttpServletRequest request) {
     // 从cookie获取token
        String token = CookieUtils.getCookieValue(request, COOKIE_TOKEN_KEY);
        Map<String , String > map=new HashMap<>();
        map.put("token", token);
        String jsonData = HttpClientUtil.doPost(Background_BASE_URL+SUMMARY_GET_URL,map);
        if(!jsonData.isEmpty() || jsonData != null) {
            MemberResult result = JsonUtils.jsonToPojo(jsonData, MemberResult.class);
            return result;
        }
        return MemberResult.build(500, "周报未填写！");
    }
    
    /*
     * (查询我的周报)
     * @see com.xinqushi.service.SummaryService#getSummaryList(int, int)
     */
    @Override
    public EUDataGridResult getSummaryList(int page, HttpServletRequest request, int rows) {
        // 从cookie获取token
        String token = CookieUtils.getCookieValue(request, COOKIE_TOKEN_KEY);
        Map<String , String > map=new HashMap<>();
        map.put("page", page + "");
        map.put("token", token);
        map.put("rows", rows+"");
        String json = HttpClientUtil.doGet(Background_BASE_URL + SUMMARY_LIST_URL, map);
        if(!json.isEmpty()) {
            EUDataGridResult result = JsonUtils.jsonToPojo(json, EUDataGridResult.class);
            return result;
        }
        return null;
    }
    
    // 通过id调用后台接口获取周报
    @Override
    public SummaryInfo getSummaryById(int id, HttpServletRequest request) {
        String token = CookieUtils.getCookieValue(request, COOKIE_TOKEN_KEY);
        Map<String , String > map=new HashMap<>();
        map.put("id", id+"");
        map.put("token", token);
        String json = HttpClientUtil.doGet(Background_BASE_URL + SUMMARY_ID_URL,map);
        SummaryInfo summary = JsonUtils.jsonToPojo(json, SummaryInfo.class);
        return summary;
    }
    
    // 保存周报评论
    @Override
    public MemberResult addComment(String comment, int sumid, HttpServletRequest request) {
        // 从cookie获取token
        String token = CookieUtils.getCookieValue(request, COOKIE_TOKEN_KEY);
        Map<String , String > map=new HashMap<>();
        map.put("comment", comment);
        map.put("sumid", sumid+"");
        map.put("token", token);
        String json = HttpClientUtil.doGet(Background_BASE_URL + SUMMARY_SAVECOMMENT_URL, map);
        if(!json.isEmpty()) {
            MemberResult result = JsonUtils.jsonToPojo(json, MemberResult.class);
            return result;
        }
        return null;
    }
    
    // 获取评论
    @Override
    public List<CommentInfo> getComment(int sumid) {
        Map<String , String > map=new HashMap<>();
        map.put("sumid", sumid +"");
        String json = HttpClientUtil.doGet(Background_BASE_URL + SUMMARY_GETCOMMENT_URL, map);
        if(json == null || json.isEmpty()) {
            return null;
        }
        List<CommentInfo> list = JsonUtils.jsonToList(json, CommentInfo.class);
        return list;
    }
    
    // 获取当前用户下一篇周报
    @Override
    public String getNextSummaryIdByUserId(HttpServletRequest request, int sumid) {
        // 从cookie获取token
        String token = CookieUtils.getCookieValue(request, COOKIE_TOKEN_KEY);
        Map<String , String > map=new HashMap<>();
        map.put("sumid", sumid +"");
        map.put("token", token);
        String string = HttpClientUtil.doGet(Background_BASE_URL + SUMMARY_NEXT_URL, map);
        return string;
    }
    
    // 获取当前用户上一篇周报
    @Override
    public String getPreSummaryIdByUserId(HttpServletRequest request, int sumid) {
        // 从cookie获取token
        String token = CookieUtils.getCookieValue(request, COOKIE_TOKEN_KEY);
        Map<String , String > map=new HashMap<>();
        map.put("sumid", sumid +"");
        map.put("token", token);
        String string = HttpClientUtil.doGet(Background_BASE_URL + SUMMARY_PRE_URL, map);
        return string;
    }
    
    // 获取当前用户当前周报
    @Override
    public String getCurrentSummaryIdByUserId(HttpServletRequest request) {
        // 从cookie获取token
        String token = CookieUtils.getCookieValue(request, COOKIE_TOKEN_KEY);
        Map<String , String > map=new HashMap<>();
        map.put("token",token);
        String string = HttpClientUtil.doGet(Background_BASE_URL + SUMMARY_NOW_URL, map);
        return string;
    }
    
    // 获取当前用户第一篇周报
    @Override
    public String getFirstSummaryIdByUserId(HttpServletRequest request) {
        // 从cookie获取token
        String token = CookieUtils.getCookieValue(request, COOKIE_TOKEN_KEY);
        Map<String , String > map=new HashMap<>();
        map.put("token", token);
        String string = HttpClientUtil.doGet(Background_BASE_URL + SUMMARY_FIRST_URL, map);
        return string;
    }
}
