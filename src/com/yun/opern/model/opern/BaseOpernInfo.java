package com.yun.opern.model.opern;

import com.yun.opern.model.OpernImgInfo;
import com.yun.opern.model.OpernInfo;

import java.util.ArrayList;

public class BaseOpernInfo {
    private int id;
    private String title = "";
    private String wordAuthor = "";
    private String songAuthor = "";
    private String singer = "";
    private String format = "";
    private String uploadUserName = "";
    private String uploadDateTime = "";
    private String origin = "";
    private int views;
    private String html = "";
    private String dataOrigin = "";
    private String categoryOne = "";
    private String categoryTwo = "";
    private String categoryThree = "";
    private int opernIndex;
    private String opernTitle;
    private String opernImg;
    private String opernOSSImg;

    public OpernInfo getOpernInfo(){
        OpernInfo opernInfo = new OpernInfo();
        opernInfo.setId(this.id);
        opernInfo.setTitle(this.title);
        opernInfo.setWordAuthor(this.wordAuthor);
        opernInfo.setSongAuthor(this.songAuthor);
        opernInfo.setSinger(this.singer);
        opernInfo.setFormat(this.format);
        opernInfo.setUploadUserName(this.uploadUserName);
        opernInfo.setUploadDateTime(this.uploadDateTime);
        opernInfo.setOrigin(this.origin);
        opernInfo.setViews(this.views);
        opernInfo.setHtml(this.html);
        opernInfo.setDataOrigin(this.dataOrigin);
        opernInfo.setImgs(new ArrayList<>());
        opernInfo.setCategoryOne(this.categoryOne);
        opernInfo.setCategoryTwo(this.categoryTwo);
        opernInfo.setCategoryThree(this.categoryThree);
        return opernInfo;
    }

    public OpernImgInfo getOpernImgInfo(){
        OpernImgInfo opernImgInfo = new OpernImgInfo();
        opernImgInfo.setId(this.id + "_" + this.opernIndex);
        opernImgInfo.setOpernId(this.id);
        opernImgInfo.setOpernIndex(this.opernIndex);
        opernImgInfo.setOpernTitle(this.title);
        opernImgInfo.setOpernImg(this.opernImg);
        opernImgInfo.setOpernOSSImg(this.opernOSSImg);
        return opernImgInfo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWordAuthor() {
        return wordAuthor;
    }

    public void setWordAuthor(String wordAuthor) {
        this.wordAuthor = wordAuthor;
    }

    public String getSongAuthor() {
        return songAuthor;
    }

    public void setSongAuthor(String songAuthor) {
        this.songAuthor = songAuthor;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getUploadUserName() {
        return uploadUserName;
    }

    public void setUploadUserName(String uploadUserName) {
        this.uploadUserName = uploadUserName;
    }

    public String getUploadDateTime() {
        return uploadDateTime;
    }

    public void setUploadDateTime(String uploadDateTime) {
        this.uploadDateTime = uploadDateTime;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getDataOrigin() {
        return dataOrigin;
    }

    public void setDataOrigin(String dataOrigin) {
        this.dataOrigin = dataOrigin;
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
        this.opernImg = opernImg;
    }

    public String getCategoryOne() {
        return categoryOne;
    }

    public void setCategoryOne(String categoryOne) {
        this.categoryOne = categoryOne;
    }

    public String getCategoryTwo() {
        return categoryTwo;
    }

    public void setCategoryTwo(String categoryTwo) {
        this.categoryTwo = categoryTwo;
    }

    public String getCategoryThree() {
        return categoryThree;
    }

    public void setCategoryThree(String categoryThree) {
        this.categoryThree = categoryThree;
    }

    public String getOpernOSSImg() {
        return opernOSSImg;
    }

    public void setOpernOSSImg(String opernOSSImg) {
        this.opernOSSImg = opernOSSImg;
    }
}
