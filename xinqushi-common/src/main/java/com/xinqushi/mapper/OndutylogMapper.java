package com.xinqushi.mapper;

import com.xinqushi.entity.Ondutylog;
import com.xinqushi.entity.OndutylogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OndutylogMapper {
    int countByExample(OndutylogExample example);

    int deleteByExample(OndutylogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ondutylog record);

    int insertSelective(Ondutylog record);

    List<Ondutylog> selectByExample(OndutylogExample example);

    Ondutylog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ondutylog record, @Param("example") OndutylogExample example);

    int updateByExample(@Param("record") Ondutylog record, @Param("example") OndutylogExample example);

    int updateByPrimaryKeySelective(Ondutylog record);

    int updateByPrimaryKey(Ondutylog record);
}