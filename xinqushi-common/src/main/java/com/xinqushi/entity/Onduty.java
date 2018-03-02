package com.xinqushi.entity;

import java.util.Date;

public class Onduty {
    private Integer id;

    private Integer mid;

    private Date start;

    private Date end;

    private Date time;

    private Boolean flag;

    private Date read;

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

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Date getRead() {
        return read;
    }

    public void setRead(Date read) {
        this.read = read;
    }
}