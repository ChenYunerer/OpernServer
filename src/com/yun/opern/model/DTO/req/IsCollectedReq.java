package com.yun.opern.model.DTO.req;

public class IsCollectedReq {
    private long userId;
    private int opernId;

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
}
