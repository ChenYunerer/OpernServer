package com.yun.opern.model.DTO.req;

public class AddCollectionReq {
    private int userId;
    private int opernId;

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
}