package com.xinqushi.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Companyaccount {
    private Integer id;

    private Byte arid;

    private Integer fid;

    private Byte ftype;

    private Integer aid;

    private Date date;

    private BigDecimal money;

    private String remark;

    private Integer mtype;

    private Byte review;

    private String details;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getArid() {
        return arid;
    }

    public void setArid(Byte arid) {
        this.arid = arid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Byte getFtype() {
        return ftype;
    }

    public void setFtype(Byte ftype) {
        this.ftype = ftype;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getMtype() {
        return mtype;
    }

    public void setMtype(Integer mtype) {
        this.mtype = mtype;
    }

    public Byte getReview() {
        return review;
    }

    public void setReview(Byte review) {
        this.review = review;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }
}