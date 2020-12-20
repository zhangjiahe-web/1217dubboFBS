package com.kgc.FinancingProduct.bean;

import java.io.Serializable;
import java.util.Date;

public class Financingproduct implements Serializable {
    private String id;

    private Integer risk;

    private String income;

    private Date salestarting;

    private Date saleend;

    private Date end;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getRisk() {
        return risk;
    }

    public void setRisk(Integer risk) {
        this.risk = risk;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income == null ? null : income.trim();
    }

    public Date getSalestarting() {
        return salestarting;
    }

    public void setSalestarting(Date salestarting) {
        this.salestarting = salestarting;
    }

    public Date getSaleend() {
        return saleend;
    }

    public void setSaleend(Date saleend) {
        this.saleend = saleend;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}