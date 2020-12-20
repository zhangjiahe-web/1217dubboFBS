package com.kgc.financingproduct.user.mapper;

import com.kgc.FinancingProduct.bean.Financingproduct;
import com.kgc.FinancingProduct.bean.FinancingproductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FinancingproductMapper {
    int countByExample(FinancingproductExample example);

    int deleteByExample(FinancingproductExample example);

    int deleteByPrimaryKey(String id);

    int insert(Financingproduct record);

    int insertSelective(Financingproduct record);

    List<Financingproduct> selectByExample(FinancingproductExample example);

    Financingproduct selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Financingproduct record, @Param("example") FinancingproductExample example);

    int updateByExample(@Param("record") Financingproduct record, @Param("example") FinancingproductExample example);

    int updateByPrimaryKeySelective(Financingproduct record);

    int updateByPrimaryKey(Financingproduct record);
}