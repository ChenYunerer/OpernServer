package com.yun.opern.model.DO;

public class OpernPicInfoDO {
    private int opernId;  // 曲谱id 非第三方id
    private int opernPicIndex;  //曲谱图片index
    private String opernPicUrl;  //曲谱图片全路径

    public OpernPicInfoDO() {
    }

    public OpernPicInfoDO(int opernId, int opernPicIndex, String opernPicUrl) {
        this.opernId = opernId;
        this.opernPicIndex = opernPicIndex;
        this.opernPicUrl = opernPicUrl;
    }

    public int getOpernId() {
        return opernId;
    }

    public void setOpernId(int opernId) {
        this.opernId = opernId;
    }

    public int getOpernPicIndex() {
        return opernPicIndex;
    }

    public void setOpernPicIndex(int opernPicIndex) {
        this.opernPicIndex = opernPicIndex;
    }

    public String getOpernPicUrl() {
        return opernPicUrl;
    }

    public void setOpernPicUrl(String opernPicUrl) {
        this.opernPicUrl = opernPicUrl;
    }

    @Override
    public String toString() {
        return "OpernPicInfoDO{" +
                "opernId=" + opernId +
                ", opernPicIndex=" + opernPicIndex +
                ", opernPicUrl='" + opernPicUrl + '\'' +
                '}';
    }
}
