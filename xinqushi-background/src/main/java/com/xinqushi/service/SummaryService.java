package com.xinqushi.service;


import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.xinqushi.common.pojo.CommentInfo;
import com.xinqushi.common.pojo.EUDataGridResult;
import com.xinqushi.common.pojo.SummaryComment;
import com.xinqushi.common.pojo.SummaryInfo;
import com.xinqushi.entity.Summary;
import com.xinqushi.utils.MemberResult;

public interface SummaryService {
    MemberResult summarySave(String token, String contents);
    MemberResult currentSummaryGet(String token);
    EUDataGridResult summaryListGet(int page, String token, String rows);
    SummaryInfo summaryByIdGet(int id, String token);
    MemberResult commentAdd(String comment, int sumid, String token);
    List<CommentInfo> commentGet(int sumid);
    String getNextSummaryIdByUserId(String token, int sumid);
    String getPreSummaryIdByUserId(String token, int sumid);
    String getCurrentSummaryIdByUserId(String token);
    String getFirstSummaryIdByUserId(String token);
    
}
