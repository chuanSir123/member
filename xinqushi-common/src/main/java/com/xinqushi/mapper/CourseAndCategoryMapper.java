package com.xinqushi.mapper;

import com.xinqushi.entity.CourseAndCategory;
import com.xinqushi.entity.CourseAndCategoryExample;
import com.xinqushi.entity.CourseAndCategoryKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseAndCategoryMapper {
    int countByExample(CourseAndCategoryExample example);

    int deleteByExample(CourseAndCategoryExample example);

    int deleteByPrimaryKey(CourseAndCategoryKey key);

    int insert(CourseAndCategory record);

    int insertSelective(CourseAndCategory record);

    List<CourseAndCategory> selectByExample(CourseAndCategoryExample example);

    CourseAndCategory selectByPrimaryKey(CourseAndCategoryKey key);

    int updateByExampleSelective(@Param("record") CourseAndCategory record, @Param("example") CourseAndCategoryExample example);

    int updateByExample(@Param("record") CourseAndCategory record, @Param("example") CourseAndCategoryExample example);

    int updateByPrimaryKeySelective(CourseAndCategory record);

    int updateByPrimaryKey(CourseAndCategory record);
}