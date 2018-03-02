package com.yun.opern.model.DTO;

public class AddCollectionReq {
    private int userId;
    private String opernId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getOpernId() {
        return opernId;
    }

    public void setOpernId(String opernId) {
        this.opernId = opernId;
    }
}
