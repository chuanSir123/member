package com.xinqushi.entity;

import java.util.Date;

public class Period {
    private Integer id;

    private Integer mid;

    private Date duetime;

    private Double amount;

    private Double restamount;

    private Double minterest;

    private Double total;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Date getDuetime() {
        return duetime;
    }

    public void setDuetime(Date duetime) {
        this.duetime = duetime;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getRestamount() {
        return restamount;
    }

    public void setRestamount(Double restamount) {
        this.restamount = restamount;
    }

    public Double getMinterest() {
        return minterest;
    }

    public void setMinterest(Double minterest) {
        this.minterest = minterest;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}