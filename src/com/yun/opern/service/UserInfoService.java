package com.yun.opern.service;

import com.yun.opern.model.BaseResponse;
import com.yun.opern.model.user.LoginRequest;

public interface UserInfoService {

    BaseResponse login(LoginRequest request);
}
