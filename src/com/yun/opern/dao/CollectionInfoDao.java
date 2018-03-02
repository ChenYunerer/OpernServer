package com.yun.opern.dao;

import com.yun.opern.model.DO.UserCollectionInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 1） 获取单个对象的方法用 get 做前缀。
 * 2） 获取多个对象的方法用 list 做前缀。
 * 3） 获取统计值的方法用 count 做前缀。
 * 4） 插入的方法用 save（推荐）或 insert 做前缀。
 * 5） 删除的方法用 remove（推荐）或 delete 做前缀。
 * 6） 修改的方法用 update 做前缀。
 */
public interface CollectionInfoDao {

    /**
     * 保存用户的收藏信息
     *
     * @param userId  用户id
     * @param opernId 收藏的曲谱id
     * @return 影响条数
     */
    int saveCollectionInfo(@Param("userId") int userId, @Param("opernId") String opernId);

    /**
     * 获取用户所有收藏信息
     *
     * @param userId 用户id
     * @return 收藏信息
     */
    List<UserCollectionInfo> listUserCollectionInfo(int userId);
}
