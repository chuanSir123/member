package com.xinqushi.mapper;

import com.xinqushi.entity.SummaryVisit;
import com.xinqushi.entity.SummaryVisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SummaryVisitMapper {
    int countByExample(SummaryVisitExample example);

    int deleteByExample(SummaryVisitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SummaryVisit record);

    int insertSelective(SummaryVisit record);

    List<SummaryVisit> selectByExample(SummaryVisitExample example);

    SummaryVisit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SummaryVisit record, @Param("example") SummaryVisitExample example);

    int updateByExample(@Param("record") SummaryVisit record, @Param("example") SummaryVisitExample example);

    int updateByPrimaryKeySelective(SummaryVisit record);

    int updateByPrimaryKey(SummaryVisit record);
}