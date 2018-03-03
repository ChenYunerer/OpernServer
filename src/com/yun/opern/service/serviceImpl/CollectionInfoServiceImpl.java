package com.yun.opern.service.serviceImpl;

import com.yun.opern.dao.CollectionInfoDao;
import com.yun.opern.model.DO.UserCollectionInfoDO;
import com.yun.opern.service.ICollectionInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public boolean addCollection(int userId, int opernId) {
        int count = collectionInfoDao.saveCollectionInfo(userId, opernId);
        return count == 1;
    }

    /**
     * 获取收藏信息
     * @param userId 用户id
     * @return 收藏信息
     */
    @Override
    public List<UserCollectionInfoDO> getCollection(int userId) {
        List<UserCollectionInfoDO> userCollectionInfoList = collectionInfoDao.listUserCollectionInfo(userId);
        return userCollectionInfoList;
    }
}
