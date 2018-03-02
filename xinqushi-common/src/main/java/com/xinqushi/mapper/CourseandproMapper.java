package com.xinqushi.mapper;

import com.xinqushi.entity.Courseandpro;
import com.xinqushi.entity.CourseandproExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseandproMapper {
    int countByExample(CourseandproExample example);

    int deleteByExample(CourseandproExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Courseandpro record);

    int insertSelective(Courseandpro record);

    List<Courseandpro> selectByExample(CourseandproExample example);

    Courseandpro selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Courseandpro record, @Param("example") CourseandproExample example);

    int updateByExample(@Param("record") Courseandpro record, @Param("example") CourseandproExample example);

    int updateByPrimaryKeySelective(Courseandpro record);

    int updateByPrimaryKey(Courseandpro record);
}