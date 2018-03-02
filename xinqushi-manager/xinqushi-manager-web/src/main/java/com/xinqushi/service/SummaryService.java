package com.xinqushi.service;

import java.util.List;


import javax.servlet.http.HttpServletRequest;

import com.xinqushi.common.pojo.CommentInfo;
import com.xinqushi.common.pojo.EUDataGridResult;
import com.xinqushi.common.pojo.SummaryComment;
import com.xinqushi.common.pojo.SummaryInfo;
import com.xinqushi.entity.Summary;
import com.xinqushi.utils.MemberResult;

public interface SummaryService {
    MemberResult saveSummary(String contents,HttpServletRequest request);
    MemberResult getCurrentSummary(HttpServletRequest request);
    EUDataGridResult getSummaryList(int page, HttpServletRequest request, int rows);
    SummaryInfo getSummaryById(int id, HttpServletRequest request);
    MemberResult addComment(String comment, int sumid, HttpServletRequest request);
    List<CommentInfo> getComment(int sumid);
    String getNextSummaryIdByUserId(HttpServletRequest request, int sumid);
    String getPreSummaryIdByUserId(HttpServletRequest request, int sumid);
    String getCurrentSummaryIdByUserId(HttpServletRequest request);
    String getFirstSummaryIdByUserId(HttpServletRequest request);
}
