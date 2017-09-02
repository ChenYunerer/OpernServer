package com.yun.opern.controller;

import com.yun.opern.model.BaseResponse;
import com.yun.opern.model.feedback.CommitFeedbackReq;
import com.yun.opern.service.FeedbackService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigInteger;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    private Logger logger = LoggerFactory.getLogger(FeedbackController.class);

    @Resource(name = "FeedbackService")
    private FeedbackService feedbackService;

    @RequestMapping(value = "/commit", method = RequestMethod.POST)
    public BaseResponse commitFeedback(@RequestBody CommitFeedbackReq request){
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        logger.info(methodName + "--start");
        BaseResponse response = new BaseResponse();
        try {
            response = feedbackService.commitFeedback(request);
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(BaseResponse.RETURN_FAIL);
            response.setMessage(e.getMessage());
        }
        logger.info(methodName + "--end");
        return response;
    }

    @RequestMapping(value = "/getFeedbackInfos", method = RequestMethod.GET)
    public BaseResponse getFeedbackInfos(BigInteger userId){
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        logger.info(methodName + "--start");
        BaseResponse response = new BaseResponse();
        try {
            response = feedbackService.getFeedbackInfos(userId);
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(BaseResponse.RETURN_FAIL);
            response.setMessage(e.getMessage());
        }
        logger.info(methodName + "--end");
        return response;
    }
}
