package com.xinqushi.mapper;

import com.xinqushi.entity.Onduty;
import com.xinqushi.entity.OndutyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OndutyMapper {
    int countByExample(OndutyExample example);

    int deleteByExample(OndutyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Onduty record);

    int insertSelective(Onduty record);

    List<Onduty> selectByExample(OndutyExample example);

    Onduty selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Onduty record, @Param("example") OndutyExample example);

    int updateByExample(@Param("record") Onduty record, @Param("example") OndutyExample example);

    int updateByPrimaryKeySelective(Onduty record);

    int updateByPrimaryKey(Onduty record);
}