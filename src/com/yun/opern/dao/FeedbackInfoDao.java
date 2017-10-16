package com.yun.opern.dao;

import com.yun.opern.model.feedback.FeedbackInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.ArrayList;

@Repository
public interface FeedbackInfoDao {

    int insertFeedbackInfo(FeedbackInfo info);

    ArrayList<FeedbackInfo> selectUserAllFeedbackInfo(@Param("userId") BigInteger userId);
}
