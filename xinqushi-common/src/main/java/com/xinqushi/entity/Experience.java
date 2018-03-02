package com.xinqushi.entity;

import java.util.Date;

public class Experience {
    private Integer id;

    private String num;

    private String password;

    private String salt;

    private Date noticetime;

    private String name;

    private String sex;

    private String phone;

    private Boolean student;

    private String school;

    private String company;

    private Date graduatedate;

    private String province;

    private Date begintime;

    private Date endtime;

    private Integer aid;

    private Integer flag;

    private String memo;

    private Boolean summaryflag;

    private Integer seatProvid;

    private String qq;

    private Integer schproid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public Date getNoticetime() {
        return noticetime;
    }

    public void setNoticetime(Date noticetime) {
        this.noticetime = noticetime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Boolean getStudent() {
        return student;
    }

    public void setStudent(Boolean student) {
        this.student = student;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public Date getGraduatedate() {
        return graduatedate;
    }

    public void setGraduatedate(Date graduatedate) {
        this.graduatedate = graduatedate;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Boolean getSummaryflag() {
        return summaryflag;
    }

    public void setSummaryflag(Boolean summaryflag) {
        this.summaryflag = summaryflag;
    }

    public Integer getSeatProvid() {
        return seatProvid;
    }

    public void setSeatProvid(Integer seatProvid) {
        this.seatProvid = seatProvid;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public Integer getSchproid() {
        return schproid;
    }

    public void setSchproid(Integer schproid) {
        this.schproid = schproid;
    }
}