package com.xinqushi.mapper;

import com.xinqushi.entity.Experience;
import com.xinqushi.entity.ExperienceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExperienceMapper {
    int countByExample(ExperienceExample example);

    int deleteByExample(ExperienceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Experience record);

    int insertSelective(Experience record);

    List<Experience> selectByExample(ExperienceExample example);

    Experience selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Experience record, @Param("example") ExperienceExample example);

    int updateByExample(@Param("record") Experience record, @Param("example") ExperienceExample example);

    int updateByPrimaryKeySelective(Experience record);

    int updateByPrimaryKey(Experience record);
}