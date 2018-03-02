package com.xinqushi.entity;

import java.util.Date;

public class Accountlog {
    private Integer id;

    private Integer mid;

    private Float amount;

    private Date date;

    private Boolean flag;

    private String type;

    private Integer fileflag;

    private Integer upflag;

    private Integer rid;

    private byte[] photo;

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

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getFileflag() {
        return fileflag;
    }

    public void setFileflag(Integer fileflag) {
        this.fileflag = fileflag;
    }

    public Integer getUpflag() {
        return upflag;
    }

    public void setUpflag(Integer upflag) {
        this.upflag = upflag;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}