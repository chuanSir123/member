package com.xinqushi.mapper;

import com.xinqushi.entity.Thanksgiving;
import com.xinqushi.entity.ThanksgivingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThanksgivingMapper {
    int countByExample(ThanksgivingExample example);

    int deleteByExample(ThanksgivingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Thanksgiving record);

    int insertSelective(Thanksgiving record);

    List<Thanksgiving> selectByExample(ThanksgivingExample example);

    Thanksgiving selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Thanksgiving record, @Param("example") ThanksgivingExample example);

    int updateByExample(@Param("record") Thanksgiving record, @Param("example") ThanksgivingExample example);

    int updateByPrimaryKeySelective(Thanksgiving record);

    int updateByPrimaryKey(Thanksgiving record);
}