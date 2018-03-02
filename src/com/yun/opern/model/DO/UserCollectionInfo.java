package com.yun.opern.model.DO;

public class UserCollectionInfo {
    private int userId;
    private int opernId;
    private int delflg;
    private String addTime;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getOpernId() {
        return opernId;
    }

    public void setOpernId(int opernId) {
        this.opernId = opernId;
    }

    public int getDelflg() {
        return delflg;
    }

    public void setDelflg(int delflg) {
        this.delflg = delflg;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    @Override
    public String toString() {
        return "UserCollectionInfo{" +
                "userId=" + userId +
                ", opernId=" + opernId +
                ", delflg=" + delflg +
                ", addTime='" + addTime + '\'' +
                '}';
    }
}
