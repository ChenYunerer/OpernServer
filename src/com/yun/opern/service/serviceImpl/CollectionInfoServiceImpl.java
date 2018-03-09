package com.yun.opern.service.serviceImpl;

import com.yun.opern.dao.CollectionInfoDao;
import com.yun.opern.model.DO.BaseOpernInfoDO;
import com.yun.opern.model.DO.UserCollectionInfoDO;
import com.yun.opern.model.DTO.res.OpernInfoDTO;
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
    public List<OpernInfoDTO> getCollection(long userId) {
        List<BaseOpernInfoDO> baseOpernInfoDOList = collectionInfoDao.listUserCollectionInfo(userId);
        return OpernInfoServiceImpl.baseOpernInfo2OpernInfo(baseOpernInfoDOList);
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

    /**
     * 删除用户的曲谱收藏
     *
     * @param userId  用户id
     * @param opernId 曲谱id
     * @return 是否成功
     */
    @Override
    public boolean removeCollection(long userId, int opernId) {
        collectionInfoDao.removeUserCollectionInfo(userId, opernId);
        return true;
    }

}
