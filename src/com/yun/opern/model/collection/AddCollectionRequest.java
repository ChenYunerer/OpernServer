package com.yun.opern.model.collection;

import java.math.BigInteger;

public class AddCollectionRequest {
    private BigInteger userId;
    private int opernId;

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    public int getOpernId() {
        return opernId;
    }

    public void setOpernId(int opernId) {
        this.opernId = opernId;
    }
}
