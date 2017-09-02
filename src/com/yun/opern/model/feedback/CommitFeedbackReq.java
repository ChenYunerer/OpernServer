package com.yun.opern.model.feedback;

import java.math.BigInteger;

public class CommitFeedbackReq {
    private BigInteger userId;
    private String feedbackMessage;

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    public String getFeedbackMessage() {
        return feedbackMessage;
    }

    public void setFeedbackMessage(String feedbackMessage) {
        this.feedbackMessage = feedbackMessage;
    }
}
