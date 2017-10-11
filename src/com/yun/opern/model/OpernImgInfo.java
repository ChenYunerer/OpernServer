package com.yun.opern.model;

public class OpernImgInfo {
    public static final String imgUrlHost = "http://www.qupu123.com";
    private String id;
    private int opernId;
    private int opernIndex;
    private String opernTitle;
    private String opernImg;
    private String opernOSSImg;

    public String getOpernOSSImg() {
        return opernOSSImg;
    }

    public void setOpernOSSImg(String opernOSSImg) {
        this.opernOSSImg = opernOSSImg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getOpernId() {
        return opernId;
    }

    public void setOpernId(int opernId) {
        this.opernId = opernId;
    }

    public int getOpernIndex() {
        return opernIndex;
    }

    public void setOpernIndex(int opernIndex) {
        this.opernIndex = opernIndex;
    }

    public String getOpernTitle() {
        return opernTitle;
    }

    public void setOpernTitle(String opernTitle) {
        this.opernTitle = opernTitle;
    }

    public String getOpernImg() {
        return opernImg;
    }

    public void setOpernImg(String opernImg) {
        this.opernImg = imgUrlHost + opernImg;
    }
}
