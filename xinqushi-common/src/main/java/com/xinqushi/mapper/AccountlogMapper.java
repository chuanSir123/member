package com.xinqushi.mapper;

import com.xinqushi.entity.Accountlog;
import com.xinqushi.entity.AccountlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountlogMapper {
    int countByExample(AccountlogExample example);

    int deleteByExample(AccountlogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Accountlog record);

    int insertSelective(Accountlog record);

    List<Accountlog> selectByExampleWithBLOBs(AccountlogExample example);

    List<Accountlog> selectByExample(AccountlogExample example);

    Accountlog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Accountlog record, @Param("example") AccountlogExample example);

    int updateByExampleWithBLOBs(@Param("record") Accountlog record, @Param("example") AccountlogExample example);

    int updateByExample(@Param("record") Accountlog record, @Param("example") AccountlogExample example);

    int updateByPrimaryKeySelective(Accountlog record);

    int updateByPrimaryKeyWithBLOBs(Accountlog record);

    int updateByPrimaryKey(Accountlog record);
}