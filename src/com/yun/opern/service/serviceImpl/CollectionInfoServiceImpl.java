package com.yun.opern.service.serviceImpl;

import com.yun.opern.dao.CollectionInfoDao;
import com.yun.opern.model.DO.UserCollectionInfo;
import com.yun.opern.service.ICollectionInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectionInfoServiceImpl implements ICollectionInfoService {

    @Autowired
    CollectionInfoDao collectionInfoDao;

    @Override
    public boolean addCollection(int userId, String opernId) {
        int count = collectionInfoDao.saveCollectionInfo(userId, opernId);
        return count == 1;
    }

    @Override
    public List<UserCollectionInfo> getCollection(int userId) {
        List<UserCollectionInfo> userCollectionInfoList = collectionInfoDao.listUserCollectionInfo(userId);
        return userCollectionInfoList;
    }
}
