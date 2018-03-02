package com.xinqushi.entity;

import java.util.Date;

public class Ondutylog {
    private Integer id;

    private Integer oid;

    private Integer mid;

    private Integer cid;

    private String behelpedname;

    private String behelpedqq;

    private String behelpedinfo;

    private String qustiondescription;

    private String solutionreport;

    private Boolean flag;

    private Date checktime;

    private Date submittime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getBehelpedname() {
        return behelpedname;
    }

    public void setBehelpedname(String behelpedname) {
        this.behelpedname = behelpedname == null ? null : behelpedname.trim();
    }

    public String getBehelpedqq() {
        return behelpedqq;
    }

    public void setBehelpedqq(String behelpedqq) {
        this.behelpedqq = behelpedqq == null ? null : behelpedqq.trim();
    }

    public String getBehelpedinfo() {
        return behelpedinfo;
    }

    public void setBehelpedinfo(String behelpedinfo) {
        this.behelpedinfo = behelpedinfo == null ? null : behelpedinfo.trim();
    }

    public String getQustiondescription() {
        return qustiondescription;
    }

    public void setQustiondescription(String qustiondescription) {
        this.qustiondescription = qustiondescription == null ? null : qustiondescription.trim();
    }

    public String getSolutionreport() {
        return solutionreport;
    }

    public void setSolutionreport(String solutionreport) {
        this.solutionreport = solutionreport == null ? null : solutionreport.trim();
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public Date getSubmittime() {
        return submittime;
    }

    public void setSubmittime(Date submittime) {
        this.submittime = submittime;
    }
}