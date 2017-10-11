package com.yun.opern.controller;


import com.yun.opern.model.BaseResponse;
import com.yun.opern.model.OpernInfo;
import com.yun.opern.model.opern.GetPopularOpernInfoRequest;
import com.yun.opern.model.opern.SearchOpernInfoByCategoryRequest;
import com.yun.opern.model.opern.SearchOpernInfoRequest;
import com.yun.opern.service.OpernInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;


@RestController
@RequestMapping("/opern")
public class OpernController {

    private Logger logger = LoggerFactory.getLogger(OpernController.class);

    @Resource(name = "OpernInfoService")
    private OpernInfoService opernInfoService;

    @RequestMapping(value = "/allOpernInfo", method = RequestMethod.GET)
    public BaseResponse<ArrayList<OpernInfo>> allOpernInfo() {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        logger.info(methodName + "--start");
        BaseResponse<ArrayList<OpernInfo>> response = new BaseResponse<>();
        try {
            response = opernInfoService.getAllOpernInfo();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(BaseResponse.RETURN_FAIL);
            response.setMessage(e.getMessage());
        }

        logger.info(methodName + "--end");

        return response;
    }

    @RequestMapping(value = "/popularOpernInfo", method = RequestMethod.GET)
    public BaseResponse popularOpernInfo(GetPopularOpernInfoRequest request) {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        logger.info(methodName + "--start");
        BaseResponse response = new BaseResponse();

        try {
            response = opernInfoService.getPopularOpernInfo(request);
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(BaseResponse.RETURN_FAIL);
            response.setMessage(e.getMessage());
        }

        logger.info(methodName + "--end");
        return response;
    }

    @RequestMapping(value = "/searchOpernInfoByCategory", method = RequestMethod.GET)
    public BaseResponse searchOpernInfoByCategory(SearchOpernInfoByCategoryRequest request) {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        logger.info(methodName + "--start");
        BaseResponse response = new BaseResponse();

        try {
            response = opernInfoService.searchOpernInfoByCategory(request);
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(BaseResponse.RETURN_FAIL);
            response.setMessage(e.getMessage());
        }

        logger.info(methodName + "--end");
        return response;
    }

    @RequestMapping(value = "/searchOpernInfo", method = RequestMethod.GET)
    public BaseResponse searchOpernInfo(SearchOpernInfoRequest request) {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        logger.info(methodName + "--start");
        BaseResponse response = new BaseResponse();
        try {
            response = opernInfoService.searchOpernInfo(request);
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(BaseResponse.RETURN_FAIL);
            response.setMessage(e.getMessage());
        }

        logger.info(methodName + "--end");
        return response;
    }

    @RequestMapping(value = "/latestUpdateTime", method = RequestMethod.GET)
    public BaseResponse latestUpdateTime() {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        logger.info(methodName + "--start");
        BaseResponse response = new BaseResponse();
        try {
            response = opernInfoService.latestUpdateTime();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(BaseResponse.RETURN_FAIL);
            response.setMessage(e.getMessage());
        }

        logger.info(methodName + "--end");
        return response;
    }

    @RequestMapping(value = "/latestUpdateOpernInfo", method = RequestMethod.GET)
    public BaseResponse latestUpdateOpernInfo() {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        logger.info(methodName + "--start");
        BaseResponse response = new BaseResponse();
        try {
            response = opernInfoService.latestUpdateOpernInfo();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(BaseResponse.RETURN_FAIL);
            response.setMessage(e.getMessage());
        }

        logger.info(methodName + "--end");
        return response;
    }
}
