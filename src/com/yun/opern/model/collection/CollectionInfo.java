package com.yun.opern.model.collection;

import java.math.BigInteger;

public class CollectionInfo {
    private BigInteger userId;
    private int opernId;
    private String delFlg;
    private String updateDataTime;

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

    public String getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(String delFlg) {
        this.delFlg = delFlg;
    }

    public String getUpdateDataTime() {
        return updateDataTime;
    }

    public void setUpdateDataTime(String updateDataTime) {
        this.updateDataTime = updateDataTime;
    }
}
