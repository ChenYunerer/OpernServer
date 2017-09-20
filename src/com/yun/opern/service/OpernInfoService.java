package com.yun.opern.service;

import com.yun.opern.model.BaseResponse;
import com.yun.opern.model.OpernInfo;
import com.yun.opern.model.opern.GetPopularOpernInfoRequest;
import com.yun.opern.model.opern.SearchOpernInfoByCategoryRequest;
import com.yun.opern.model.opern.SearchOpernInfoRequest;

import java.util.ArrayList;

/**
 * Created by Yun on 2017/7/3 0003.
 */
public interface OpernInfoService {

    BaseResponse<ArrayList<OpernInfo>> getAllOpernInfo();

    BaseResponse getPopularOpernInfo(GetPopularOpernInfoRequest request);

    BaseResponse searchOpernInfoByCategory(SearchOpernInfoByCategoryRequest request);

    BaseResponse searchOpernInfo(SearchOpernInfoRequest request);

}
