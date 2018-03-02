package com.yun.opern.service.serviceImpl;

import com.yun.opern.dao.UserInfoDao;
import com.yun.opern.model.DO.UserInfoDO;
import com.yun.opern.model.DTO.res.BaseResponseDTO;
import com.yun.opern.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements IUserInfoService {

    @Autowired
    UserInfoDao userInfoDao;

    /**
     * 用户登陆
     *
     * @param userInfoDO 用户信息
     * @return BaseResponse
     */
    @Override
    public BaseResponseDTO login(UserInfoDO userInfoDO) {
        return null;
    }
}
