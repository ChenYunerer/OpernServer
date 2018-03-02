package com.yun.opern.service;

import com.yun.opern.model.DO.UserInfoDO;
import com.yun.opern.model.DTO.res.BaseResponseDTO;

public interface IUserInfoService {

    /**
     * 用户登陆
     *
     * @param userInfoDO 用户信息
     * @return BaseResponse
     */
    BaseResponseDTO login(UserInfoDO userInfoDO);
}
