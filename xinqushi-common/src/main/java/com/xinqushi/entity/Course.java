package com.xinqushi.entity;

public class Course {
    private Integer id;

    private String title;

    private Integer chid;

    private Boolean optionalFlag;

    private Integer order;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getChid() {
        return chid;
    }

    public void setChid(Integer chid) {
        this.chid = chid;
    }

    public Boolean getOptionalFlag() {
        return optionalFlag;
    }

    public void setOptionalFlag(Boolean optionalFlag) {
        this.optionalFlag = optionalFlag;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
}