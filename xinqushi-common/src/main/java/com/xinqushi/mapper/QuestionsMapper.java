package com.xinqushi.mapper;

import com.xinqushi.entity.Questions;
import com.xinqushi.entity.QuestionsExample;
import com.xinqushi.entity.QuestionsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionsMapper {
    int countByExample(QuestionsExample example);

    int deleteByExample(QuestionsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(QuestionsWithBLOBs record);

    int insertSelective(QuestionsWithBLOBs record);

    List<QuestionsWithBLOBs> selectByExampleWithBLOBs(QuestionsExample example);

    List<Questions> selectByExample(QuestionsExample example);

    QuestionsWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") QuestionsWithBLOBs record, @Param("example") QuestionsExample example);

    int updateByExampleWithBLOBs(@Param("record") QuestionsWithBLOBs record, @Param("example") QuestionsExample example);

    int updateByExample(@Param("record") Questions record, @Param("example") QuestionsExample example);

    int updateByPrimaryKeySelective(QuestionsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(QuestionsWithBLOBs record);

    int updateByPrimaryKey(Questions record);
}