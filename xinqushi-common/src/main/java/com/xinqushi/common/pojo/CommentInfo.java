package com.xinqushi.common.pojo;

import com.xinqushi.entity.Admin;
import com.xinqushi.entity.Clue;
import com.xinqushi.entity.Experience;
import com.xinqushi.entity.Member;

public class CommentInfo {
    private Admin admin;
    private Member member;
    private Experience experience;
    private Clue clue;
    private String time;
    private String content;
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public Clue getClue() {
        return clue;
    }
    public void setClue(Clue clue) {
        this.clue = clue;
    }
    
    public Admin getAdmin() {
        return admin;
    }
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    public Member getMember() {
        return member;
    }
    public void setMember(Member member) {
        this.member = member;
    }
    public Experience getExperience() {
        return experience;
    }
    public void setExperience(Experience experience) {
        this.experience = experience;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
