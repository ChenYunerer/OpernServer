package com.yun.opern.model;

public class OpernTempInfo {
    private String htmlUrl;
    private String title;
    private String maker;
    private String author;
    private String singer;

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "OpernInfo{" +
                "htmlUrl='" + htmlUrl + '\'' +
                ", title='" + title + '\'' +
                ", maker='" + maker + '\'' +
                ", author='" + author + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }
}
