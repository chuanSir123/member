package com.xinqushi.entity;

import java.math.BigDecimal;

public class Courseandpro {
    private Integer id;

    private Integer meid;

    private Integer identitytype;

    private Integer caid;

    private Integer chorder;

    private Integer corder;

    private BigDecimal proportion;

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

    public Integer getCaid() {
        return caid;
    }

    public void setCaid(Integer caid) {
        this.caid = caid;
    }

    public Integer getChorder() {
        return chorder;
    }

    public void setChorder(Integer chorder) {
        this.chorder = chorder;
    }

    public Integer getCorder() {
        return corder;
    }

    public void setCorder(Integer corder) {
        this.corder = corder;
    }

    public BigDecimal getProportion() {
        return proportion;
    }

    public void setProportion(BigDecimal proportion) {
        this.proportion = proportion;
    }
}