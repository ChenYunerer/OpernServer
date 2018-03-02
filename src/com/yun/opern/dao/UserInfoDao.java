package com.yun.opern.dao;

import com.yun.opern.model.DO.UserInfo;
import org.springframework.stereotype.Repository;

/**
 * 1） 获取单个对象的方法用 get 做前缀。
 * 2） 获取多个对象的方法用 list 做前缀。
 * 3） 获取统计值的方法用 count 做前缀。
 * 4） 插入的方法用 save（推荐）或 insert 做前缀。
 * 5） 删除的方法用 remove（推荐）或 delete 做前缀。
 * 6） 修改的方法用 update 做前缀。
 */
public interface UserInfoDao {

    /**
     * 通过平台名称 在平台的id获取用户信息
     *
     * @param originName 平台名称
     * @param originId   在平台的id
     * @return 用户信息
     */
    UserInfo getUserInfoByOrigin(String originName, String originId);

    /**
     * 插入保存用户信息
     *
     * @param userInfo 用户信息
     * @return 0 失败 > 0 成功
     */
    int saveUserInfo(UserInfo userInfo);

}
