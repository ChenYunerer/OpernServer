package com.yun.opern.model.DO;

import java.sql.Timestamp;

public class UserCollectionInfoDO {
    private long userId;  //用户id
    private int opernId;  //曲谱id 非第三方id
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
                ", addTime=" + addTime +
                '}';
    }
}
