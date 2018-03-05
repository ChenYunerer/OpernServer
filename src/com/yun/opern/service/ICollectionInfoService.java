package com.yun.opern.service;

import com.yun.opern.model.DO.UserCollectionInfoDO;

import java.util.List;

public interface ICollectionInfoService {

    /**
     * 添加收藏
     *
     * @param userId  用户id
     * @param opernId 曲谱id
     * @return 是否成功
     */
    boolean addCollection(long userId, int opernId);

    /**
     * 获取收藏信息
     * @param userId 用户id
     * @return 收藏信息
     */
    List<UserCollectionInfoDO> getCollection(long userId);

    /**
     * 查询用户对应的曲谱收藏是否存在
     *
     * @param userId  用户id
     * @param opernId 曲谱id
     * @return 是否存在
     */
    boolean isCollectionExist(long userId, int opernId);
}
