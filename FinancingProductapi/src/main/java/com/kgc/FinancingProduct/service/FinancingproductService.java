package com.kgc.FinancingProduct.service;

import com.kgc.FinancingProduct.bean.Financingproduct;
import com.kgc.FinancingProduct.bean.FinancingproductExample;

import java.util.List;

public interface FinancingproductService {
    List<Financingproduct> selectByExample(String ID,Integer risk);
    int insertSelective(Financingproduct record);
}
