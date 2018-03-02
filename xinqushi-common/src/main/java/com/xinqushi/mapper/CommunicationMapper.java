package com.xinqushi.mapper;

import com.xinqushi.entity.Communication;
import com.xinqushi.entity.CommunicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommunicationMapper {
    int countByExample(CommunicationExample example);

    int deleteByExample(CommunicationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Communication record);

    int insertSelective(Communication record);

    List<Communication> selectByExampleWithBLOBs(CommunicationExample example);

    List<Communication> selectByExample(CommunicationExample example);

    Communication selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Communication record, @Param("example") CommunicationExample example);

    int updateByExampleWithBLOBs(@Param("record") Communication record, @Param("example") CommunicationExample example);

    int updateByExample(@Param("record") Communication record, @Param("example") CommunicationExample example);

    int updateByPrimaryKeySelective(Communication record);

    int updateByPrimaryKeyWithBLOBs(Communication record);

    int updateByPrimaryKey(Communication record);
}