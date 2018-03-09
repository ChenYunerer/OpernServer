package com.yun.opern.model.DO;

import java.sql.Timestamp;

public class UserCollectionInfoDO {
    private long userId;  //用户id
    private int opernId;  //曲谱id 非第三方id
    private int delflg;  //删除状态 1 正常 2 删除
    private Timestamp addTime;  //添加时间

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
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

    public Timestamp getAddTime() {
        return addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }

    @Override
    public String toString() {
        return "UserCollectionInfoDO{" +
                "userId=" + userId +
                ", opernId=" + opernId +
                ", delflg=" + delflg +
                ", addTime='" + addTime + '\'' +
                '}';
    }
}
