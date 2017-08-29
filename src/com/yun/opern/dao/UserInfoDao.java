package com.yun.opern.dao;

import com.yun.opern.model.user.UserInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoDao {
    
    int userLogin(UserInfo info);
}
