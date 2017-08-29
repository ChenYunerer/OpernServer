package com.yun.opern.model.user;

import java.math.BigInteger;

public class UserInfo {
    private int userType;  //0：微博 1：QQ 2：微信
    private BigInteger userId;
    private String userName;
    private String userGender;
    private String fastLoginDataTime;
    private String lastLoginDataTime;

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getFastLoginDataTime() {
        return fastLoginDataTime;
    }

    public void setFastLoginDataTime(String fastLoginDataTime) {
        this.fastLoginDataTime = fastLoginDataTime;
    }

    public String getLastLoginDataTime() {
        return lastLoginDataTime;
    }

    public void setLastLoginDataTime(String lastLoginDataTime) {
        this.lastLoginDataTime = lastLoginDataTime;
    }
}
