package com.yun.opern.service.serviceImpl;

import com.yun.opern.dao.CollectionInfoDao;
import com.yun.opern.model.DO.UserCollectionInfoDO;
import com.yun.opern.service.ICollectionInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectionInfoServiceImpl implements ICollectionInfoService {

    @Autowired
    CollectionInfoDao collectionInfoDao;

    /**
     * 添加收藏
     *
     * @param userId  用户id
     * @param opernId 曲谱id
     * @return 是否成功
     */
    @Override
    public boolean addCollection(long userId, int opernId) {
        int count = collectionInfoDao.saveCollectionInfo(userId, opernId);
        return count == 1;
    }

    /**
     * 获取收藏信息
     *
     * @param userId 用户id
     * @return 收藏信息
     */
    @Override
    public List<UserCollectionInfoDO> getCollection(long userId) {
        List<UserCollectionInfoDO> userCollectionInfoList = collectionInfoDao.listUserCollectionInfo(userId);
        return userCollectionInfoList;
    }

    /**
     * 查询用户对应的曲谱收藏是否存在
     *
     * @param userId  用户id
     * @param opernId 曲谱id
     * @return 是否存在
     */
    @Override
    public boolean isCollectionExist(long userId, int opernId) {
        UserCollectionInfoDO userCollectionInfo = collectionInfoDao.getUserCollectionInfo(userId, opernId);
        return userCollectionInfo != null;
    }
}
