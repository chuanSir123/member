package com.xinqushi.entity;

import java.util.Date;

public class Visitor {
    private Integer id;

    private Integer meid;

    private Integer identitytype;

    private Date visittime;

    private Date lefttime;

    private String ip;

    private String agent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMeid() {
        return meid;
    }

    public void setMeid(Integer meid) {
        this.meid = meid;
    }

    public Integer getIdentitytype() {
        return identitytype;
    }

    public void setIdentitytype(Integer identitytype) {
        this.identitytype = identitytype;
    }

    public Date getVisittime() {
        return visittime;
    }

    public void setVisittime(Date visittime) {
        this.visittime = visittime;
    }

    public Date getLefttime() {
        return lefttime;
    }

    public void setLefttime(Date lefttime) {
        this.lefttime = lefttime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent == null ? null : agent.trim();
    }
}