package com.kgc.financingproduct.user.controller;

import com.kgc.FinancingProduct.bean.Financingproduct;
import com.kgc.FinancingProduct.service.FinancingproductService;
import com.sun.org.apache.regexp.internal.RE;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class financingproductController {
    @Reference
    FinancingproductService financingproductService;

    @RequestMapping("/")
    public  String index(Model model,
                         @RequestParam(value="ID",required =false,defaultValue = "")String ID,
                         @RequestParam(value="risk",required =false,defaultValue ="")Integer risk){
        List<Financingproduct> financingproducts = financingproductService.selectByExample(ID, risk);
        model.addAttribute("financingproducts",financingproducts);
        return "select";
    }
    @RequestMapping("toadd")
    public  String  toadd(){
        return "add";
    }
    @RequestMapping("doadd")
    public  String  doadd(Financingproduct financingproduct){
        int i = financingproductService.insertSelective(financingproduct);
        return "redirect:/";
    }
}
