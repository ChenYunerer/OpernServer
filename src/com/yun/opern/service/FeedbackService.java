package com.yun.opern.service;

import com.yun.opern.model.BaseResponse;
import com.yun.opern.model.feedback.CommitFeedbackReq;

import java.math.BigInteger;

public interface FeedbackService {

    BaseResponse commitFeedback(CommitFeedbackReq request);

    BaseResponse getFeedbackInfos(BigInteger userId);
}
