package com.yun.opern.dao;

import com.yun.opern.model.collection.CollectionInfo;
import com.yun.opern.model.opern.BaseOpernInfo;
import org.apache.ibatis.annotations.Param;

import java.math.BigInteger;
import java.util.ArrayList;


public interface CollectionInfoDao {


    int addCollectionInfo(@Param("userId") BigInteger userId, @Param("opernId") int opernId);

    int removeCollectionInfo(@Param("userId") BigInteger userId, @Param("opernId") int opernId);

    ArrayList<CollectionInfo> getUserAllCollectionInfo(@Param("userId") BigInteger userId);

    CollectionInfo getUserCollectionInfo(@Param("userId") BigInteger userId, @Param("opernId") int opernId);

    ArrayList<BaseOpernInfo> getCollectionOpernInfo(@Param("userId") BigInteger userId);
}
