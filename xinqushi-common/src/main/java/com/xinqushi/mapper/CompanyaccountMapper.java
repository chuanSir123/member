package com.xinqushi.mapper;

import com.xinqushi.entity.Companyaccount;
import com.xinqushi.entity.CompanyaccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyaccountMapper {
    int countByExample(CompanyaccountExample example);

    int deleteByExample(CompanyaccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Companyaccount record);

    int insertSelective(Companyaccount record);

    List<Companyaccount> selectByExampleWithBLOBs(CompanyaccountExample example);

    List<Companyaccount> selectByExample(CompanyaccountExample example);

    Companyaccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Companyaccount record, @Param("example") CompanyaccountExample example);

    int updateByExampleWithBLOBs(@Param("record") Companyaccount record, @Param("example") CompanyaccountExample example);

    int updateByExample(@Param("record") Companyaccount record, @Param("example") CompanyaccountExample example);

    int updateByPrimaryKeySelective(Companyaccount record);

    int updateByPrimaryKeyWithBLOBs(Companyaccount record);

    int updateByPrimaryKey(Companyaccount record);
}