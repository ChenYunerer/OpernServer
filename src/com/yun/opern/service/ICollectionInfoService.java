package com.yun.opern.service;

import com.yun.opern.model.DO.UserCollectionInfoDO;

import java.util.List;

public interface ICollectionInfoService {

    boolean addCollection(int userId, int opernId);

    List<UserCollectionInfoDO> getCollection(int userId);
}
