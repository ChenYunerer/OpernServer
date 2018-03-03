package com.yun.opern.service;

import com.yun.opern.model.DTO.res.OpernInfoDTO;

import java.util.List;

public interface IOpernInfoService {

    /**
     * 判断曲谱是否存在
     *
     * @param id 曲谱id
     * @return 是否存在
     */
    boolean isOpernInfoExist(int id);

    /**
     * 获取曲谱信息 按照浏览量排序
     * @param pageNum 分页页码
     * @param pageSize 分页大小
     * @return 曲谱数据
     */
    List<OpernInfoDTO> listOpernInfoOrderByViewCount(int pageNum, int pageSize);

    /**
     * 获取曲谱信息 随机
     * @param pageSize 分页大小
     * @return 曲谱数据
     */
    List<OpernInfoDTO> listRandomOpernInfo(int pageSize);

    /**
     * 搜索曲谱
     * @param searchParameter 搜索参数 曲谱名称 曲作者 词作者
     * @param pageNum 分页页码
     * @param pageSize 分页大小
     * @return 曲谱数据
     */
    List<OpernInfoDTO> searchOpernInfo(String searchParameter, int pageNum, int pageSize);
}
