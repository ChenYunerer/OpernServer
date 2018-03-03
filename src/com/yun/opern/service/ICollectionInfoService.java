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
    boolean addCollection(int userId, int opernId);

    /**
     * 获取收藏信息
     * @param userId 用户id
     * @return 收藏信息
     */
    List<UserCollectionInfoDO> getCollection(int userId);
}
