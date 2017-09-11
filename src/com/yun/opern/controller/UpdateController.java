package com.yun.opern.controller;

import com.yun.opern.model.BaseResponse;
import com.yun.opern.service.UpdateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/update")
public class UpdateController {

    private Logger logger = LoggerFactory.getLogger(UpdateController.class);

    @Resource(name = "UpdateService")
    private UpdateService updateService;

    @RequestMapping(value = "/checkVersion", method = RequestMethod.GET)
    public BaseResponse checkVersion(){
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        logger.info(methodName + "--start");
        BaseResponse response = new BaseResponse();
        try {
            response = updateService.checkVersion();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(BaseResponse.RETURN_FAIL);
            response.setMessage(e.getMessage());
        }

        logger.info(methodName + "--end");
        return response;
    }

}
