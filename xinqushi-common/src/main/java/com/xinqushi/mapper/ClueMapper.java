package com.xinqushi.mapper;

import com.xinqushi.entity.Clue;
import com.xinqushi.entity.ClueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClueMapper {
    int countByExample(ClueExample example);

    int deleteByExample(ClueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Clue record);

    int insertSelective(Clue record);

    List<Clue> selectByExample(ClueExample example);

    Clue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Clue record, @Param("example") ClueExample example);

    int updateByExample(@Param("record") Clue record, @Param("example") ClueExample example);

    int updateByPrimaryKeySelective(Clue record);

    int updateByPrimaryKey(Clue record);
}