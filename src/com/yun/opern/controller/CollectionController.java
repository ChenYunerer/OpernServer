package com.yun.opern.controller;

import com.yun.opern.model.BaseResponse;
import com.yun.opern.model.collection.*;
import com.yun.opern.service.CollectionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/collection")
public class CollectionController {
    private Logger logger = LoggerFactory.getLogger(CollectionController.class);

    @Resource(name = "CollectionService")
    private CollectionService collectionService;

    @RequestMapping(value = "/isCollected", method = RequestMethod.GET)
    public BaseResponse isCollected(IsCollectedRequest request){
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        logger.info(methodName + "--start");
        BaseResponse response = new BaseResponse();
        try {
            response = collectionService.isCollected(request);
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(BaseResponse.RETURN_FAIL);
            response.setMessage(e.getMessage());
        }
        logger.info(methodName + "--end");
        return response;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public BaseResponse addCollection(AddCollectionRequest request){
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        logger.info(methodName + "--start");
        BaseResponse response = new BaseResponse();
        try {
            response = collectionService.addCollection(request);
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(BaseResponse.RETURN_FAIL);
            response.setMessage(e.getMessage());
        }

        logger.info(methodName + "--end");

        return response;
    }

    @RequestMapping(value = "/remove", method = RequestMethod.GET)
    public BaseResponse removeCollection(RemoveCollectionRequest request){
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        logger.info(methodName + "--start");
        BaseResponse response = new BaseResponse();
        try {
            response = collectionService.removeCollection(request);
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(BaseResponse.RETURN_FAIL);
            response.setMessage(e.getMessage());
        }
        logger.info(methodName + "--end");
        return response;
    }

    @RequestMapping(value = "/collection", method = RequestMethod.GET)
    public BaseResponse getCollection(GetCollectionRequest request){
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        logger.info(methodName + "--start");
        BaseResponse response = new BaseResponse();
        try {
            response = collectionService.getCollection(request);
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(BaseResponse.RETURN_FAIL);
            response.setMessage(e.getMessage());
        }
        logger.info(methodName + "--end");
        return response;
    }

    @RequestMapping(value = "/collectionOpernInfo", method = RequestMethod.GET)
    public BaseResponse getCollectionOpernInfo(GetCollectionOpernRequest request){
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        logger.info(methodName + "--start");
        BaseResponse response = new BaseResponse();
        try {
            response = collectionService.getCollectionOpern(request);
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(BaseResponse.RETURN_FAIL);
            response.setMessage(e.getMessage());
        }
        logger.info(methodName + "--end");
        return response;
    }
}
