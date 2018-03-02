package com.xinqushi.entity;

import java.util.Date;

public class Questions {
    private Long id;

    private Integer cid;

    private String qperson;

    private String sperson;

    private Date time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getQperson() {
        return qperson;
    }

    public void setQperson(String qperson) {
        this.qperson = qperson == null ? null : qperson.trim();
    }

    public String getSperson() {
        return sperson;
    }

    public void setSperson(String sperson) {
        this.sperson = sperson == null ? null : sperson.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}