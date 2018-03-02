package com.xinqushi.mapper;

import com.xinqushi.entity.Companyfirm;
import com.xinqushi.entity.CompanyfirmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyfirmMapper {
    int countByExample(CompanyfirmExample example);

    int deleteByExample(CompanyfirmExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Companyfirm record);

    int insertSelective(Companyfirm record);

    List<Companyfirm> selectByExample(CompanyfirmExample example);

    Companyfirm selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Companyfirm record, @Param("example") CompanyfirmExample example);

    int updateByExample(@Param("record") Companyfirm record, @Param("example") CompanyfirmExample example);

    int updateByPrimaryKeySelective(Companyfirm record);

    int updateByPrimaryKey(Companyfirm record);
}