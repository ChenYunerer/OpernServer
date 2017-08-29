package com.yun.opern.controller;

import com.yun.opern.model.BaseResponse;
import com.yun.opern.model.user.LoginRequest;
import com.yun.opern.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource(name = "UserInfoService")
    private UserInfoService userInfoService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public BaseResponse login(@RequestBody LoginRequest request){
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        logger.info(methodName + "--start");
        BaseResponse response = new BaseResponse();
        try {
            response = userInfoService.login(request);
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(BaseResponse.RETURN_FAIL);
            response.setMessage(e.getMessage());
        }

        logger.info(methodName + "--end");
        return response;
    }

}
