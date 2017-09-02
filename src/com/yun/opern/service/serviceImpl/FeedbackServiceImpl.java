package com.yun.opern.service.serviceImpl;

import com.yun.opern.dao.FeedbackInfoDao;
import com.yun.opern.model.BaseResponse;
import com.yun.opern.model.feedback.CommitFeedbackReq;
import com.yun.opern.model.feedback.FeedbackInfo;
import com.yun.opern.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;

@Service("FeedbackService")
public class FeedbackServiceImpl implements FeedbackService{

    @Autowired
    FeedbackInfoDao feedbackInfoDao;

    @Override
    public BaseResponse commitFeedback(CommitFeedbackReq request) {
        BaseResponse response = new BaseResponse();
        FeedbackInfo feedbackInfo = new FeedbackInfo();
        feedbackInfo.setUserId(request.getUserId());
        feedbackInfo.setFeedbackMessage(request.getFeedbackMessage());
        int count = feedbackInfoDao.insertFeedbackInfo(feedbackInfo);
        response.setCode(count == 1? BaseResponse.RETURN_SUCCESS : BaseResponse.RETURN_FAIL);
        response.setMessage(count == 1 ? "提交成功" : "提交失败");
        return response;
    }

    @Override
    public BaseResponse getFeedbackInfos(BigInteger userId) {
        BaseResponse<ArrayList<FeedbackInfo>> response = new BaseResponse<>();
        ArrayList<FeedbackInfo> feedbackInfoList = feedbackInfoDao.selectUserAllFeedbackInfo(userId);
        response.setCode(BaseResponse.RETURN_SUCCESS);
        response.setMessage("获取数据成功");
        response.setData(feedbackInfoList);
        return response;
    }
}
