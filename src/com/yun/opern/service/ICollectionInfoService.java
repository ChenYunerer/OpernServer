package com.yun.opern.service;

import com.yun.opern.model.DO.UserCollectionInfo;

import java.util.List;

public interface ICollectionInfoService {

    boolean addCollection(int userId, String opernId);

    List<UserCollectionInfo> getCollection(int userId);
}
