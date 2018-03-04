package com.feinno.talk.springservicetalk.com.feinno.talk.service.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by yushaobo on 18-2-2.
 * 用户表
 */
public class TalkUser {

    /**
     * 用户唯一ID
     * */
    @JSONField(name = "userID")
    private String userID;

    /**
     * 用户密码
     * */
    @JSONField(name = "passWord")
    private String passWord;

    /**
     * 用户名
     * */
    @JSONField(name = "userName")
    private String userName;

    /**
     * 年龄
     * */
    @JSONField(name = "userAge")
    private String userAge;

    /**
     * 手机号
     * */
    @JSONField(name = "mobileNO")
    private String mobileNO;

    /**
     * 邮箱
     * */
    @JSONField(name = "email")
    private String email;

    /**
     * 兴趣爱好
     * */
    @JSONField(name = "like")
    private String like;

    /**
     * 时间戳
     * */
    @JSONField(name = "timestamp")
    private Date timestamp;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getMobileNO() {
        return mobileNO;
    }

    public void setMobileNO(String mobileNO) {
        this.mobileNO = mobileNO;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
