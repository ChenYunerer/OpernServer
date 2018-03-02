package com.yun.opern.service;

import com.yun.opern.model.DO.UserInfo;
import com.yun.opern.model.DTO.BaseResponseDTO;

public interface IUserInfoService {

    /**
     * 用户登陆
     *
     * @param userInfo 用户信息
     * @return BaseResponse
     */
    BaseResponseDTO login(UserInfo userInfo);
}
