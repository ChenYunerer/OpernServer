package com.yun.opern.model.DTO.res;

import com.yun.opern.model.DO.OpernPicInfoDO;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OpernInfoDTO {
    private int id;  //自增id
    private String originName = "";  //原平台名称 如中国曲谱网
    private String originId = "";  //曲谱在原平台的id
    private String opernName = "";  //曲谱名称
    private String opernWordAuthor = "";  //曲谱词作者
    private String opernSongAuthor = "";  //曲谱曲作者
    private int opernViews;  //曲谱在原平台上的浏览量
    private String opernUploader = "";  //曲谱在原平台的上传者
    private String opernOriginHtmlUrl = "";  //曲谱在原平台的访问地址全路径
    private int opernPicNum;  //曲谱图片数量
    private String opernFirstPicUrl = "";  //曲谱首张曲谱图片地址
    private int opernFormat;  //曲谱格式 1简谱 2五线谱 3简线混排 4其它
    private String opernCategoryOne = "";  //一级类目
    private String opernCategoryTwo = "";  //二级类目
    private String opernUploadTime = "";  //曲谱在原平台的上传时间
    private Timestamp addTime;  //记录添加时间
    private List<OpernPicInfoDO> opernPicInfoList;  //曲谱图片

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OpernInfoDTO that = (OpernInfoDTO) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    public OpernInfoDTO() {
    }

    public OpernInfoDTO(int id, String originName, String originId, String opernName, String opernWordAuthor, String opernSongAuthor, int opernViews, String opernUploader, String opernOriginHtmlUrl, int opernPicNum, String opernFirstPicUrl, int opernFormat, String opernCategoryOne, String opernCategoryTwo, String opernUploadTime, Timestamp addTime) {
        this.id = id;
        this.originName = originName;
        this.originId = originId;
        this.opernName = opernName;
        this.opernWordAuthor = opernWordAuthor;
        this.opernSongAuthor = opernSongAuthor;
        this.opernViews = opernViews;
        this.opernUploader = opernUploader;
        this.opernOriginHtmlUrl = opernOriginHtmlUrl;
        this.opernPicNum = opernPicNum;
        this.opernFirstPicUrl = opernFirstPicUrl;
        this.opernFormat = opernFormat;
        this.opernCategoryOne = opernCategoryOne;
        this.opernCategoryTwo = opernCategoryTwo;
        this.opernUploadTime = opernUploadTime;
        this.addTime = addTime;
        this.opernPicInfoList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOriginName() {
        return originName;
    }

    public void setOriginName(String originName) {
        this.originName = originName;
    }

    public String getOriginId() {
        return originId;
    }

    public void setOriginId(String originId) {
        this.originId = originId;
    }

    public String getOpernName() {
        return opernName;
    }

    public void setOpernName(String opernName) {
        this.opernName = opernName;
    }

    public String getOpernWordAuthor() {
        return opernWordAuthor;
    }

    public void setOpernWordAuthor(String opernWordAuthor) {
        this.opernWordAuthor = opernWordAuthor;
    }

    public String getOpernSongAuthor() {
        return opernSongAuthor;
    }

    public void setOpernSongAuthor(String opernSongAuthor) {
        this.opernSongAuthor = opernSongAuthor;
    }

    public int getOpernViews() {
        return opernViews;
    }

    public void setOpernViews(int opernViews) {
        this.opernViews = opernViews;
    }

    public String getOpernUploader() {
        return opernUploader;
    }

    public void setOpernUploader(String opernUploader) {
        this.opernUploader = opernUploader;
    }

    public String getOpernOriginHtmlUrl() {
        return opernOriginHtmlUrl;
    }

    public void setOpernOriginHtmlUrl(String opernOriginHtmlUrl) {
        this.opernOriginHtmlUrl = opernOriginHtmlUrl;
    }

    public int getOpernPicNum() {
        return opernPicNum;
    }

    public void setOpernPicNum(int opernPicNum) {
        this.opernPicNum = opernPicNum;
    }

    public String getOpernFirstPicUrl() {
        return opernFirstPicUrl;
    }

    public void setOpernFirstPicUrl(String opernFirstPicUrl) {
        this.opernFirstPicUrl = opernFirstPicUrl;
    }

    public int getOpernFormat() {
        return opernFormat;
    }

    public void setOpernFormat(int opernFormat) {
        this.opernFormat = opernFormat;
    }

    public String getOpernCategoryOne() {
        return opernCategoryOne;
    }

    public void setOpernCategoryOne(String opernCategoryOne) {
        this.opernCategoryOne = opernCategoryOne;
    }

    public String getOpernCategoryTwo() {
        return opernCategoryTwo;
    }

    public void setOpernCategoryTwo(String opernCategoryTwo) {
        this.opernCategoryTwo = opernCategoryTwo;
    }

    public String getOpernUploadTime() {
        return opernUploadTime;
    }

    public void setOpernUploadTime(String opernUploadTime) {
        this.opernUploadTime = opernUploadTime;
    }

    public Timestamp getAddTime() {
        return addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }

    public List<OpernPicInfoDO> getOpernPicInfoList() {
        return opernPicInfoList;
    }

    public void setOpernPicInfoList(List<OpernPicInfoDO> opernPicInfoList) {
        this.opernPicInfoList = opernPicInfoList;
    }
}
