package com.kgc.financingproduct.user.service;

import com.kgc.FinancingProduct.bean.Financingproduct;
import com.kgc.FinancingProduct.bean.FinancingproductExample;
import com.kgc.FinancingProduct.service.FinancingproductService;
import com.kgc.financingproduct.user.mapper.FinancingproductMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
@Component
@Service
public class FinancingproductServiceImpl implements FinancingproductService {
    @Resource
    FinancingproductMapper financingproductMapper;
    @Override
    public List<Financingproduct> selectByExample(String ID,Integer risk) {
        FinancingproductExample example=new FinancingproductExample();
        FinancingproductExample.Criteria criteria = example.createCriteria();
        if (ID!=null&&ID.isEmpty()==false){
            criteria.andIdLike("%"+ID+"%");
        }
        if (risk!=null&&risk!=0){
            criteria.andRiskEqualTo(risk);
        }

        return   financingproductMapper.selectByExample(example);
    }

    @Override
    public int insertSelective(Financingproduct record) {
        return financingproductMapper.insertSelective(record);
    }
}
