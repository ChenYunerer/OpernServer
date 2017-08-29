package com.yun.opern.service.serviceImpl;

import com.yun.opern.dao.UserInfoDao;
import com.yun.opern.model.BaseResponse;
import com.yun.opern.model.user.LoginRequest;
import com.yun.opern.model.user.UserInfo;
import com.yun.opern.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserInfoService")
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    UserInfoDao userInfoDao;

    @Override
    public BaseResponse login(LoginRequest request) {
        BaseResponse baseResponse = new BaseResponse();
        UserInfo userInfo = new UserInfo();
        userInfo.setUserType(0);
        userInfo.setUserId(request.getUserId());
        userInfo.setUserName(request.getUserName());
        userInfo.setUserGender(request.getUserGender());
        int i = userInfoDao.userLogin(userInfo);
        baseResponse.setCode( i == 0 ? BaseResponse.RETURN_FAIL : BaseResponse.RETURN_SUCCESS);
        baseResponse.setMessage("登录成功");
        return baseResponse;
    }
}
