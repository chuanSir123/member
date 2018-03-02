package com.xinqushi.mapper;

import com.xinqushi.entity.Dailylog;
import com.xinqushi.entity.DailylogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DailylogMapper {
    int countByExample(DailylogExample example);

    int deleteByExample(DailylogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dailylog record);

    int insertSelective(Dailylog record);

    List<Dailylog> selectByExampleWithBLOBs(DailylogExample example);

    List<Dailylog> selectByExample(DailylogExample example);

    Dailylog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dailylog record, @Param("example") DailylogExample example);

    int updateByExampleWithBLOBs(@Param("record") Dailylog record, @Param("example") DailylogExample example);

    int updateByExample(@Param("record") Dailylog record, @Param("example") DailylogExample example);

    int updateByPrimaryKeySelective(Dailylog record);

    int updateByPrimaryKeyWithBLOBs(Dailylog record);

    int updateByPrimaryKey(Dailylog record);
}