package com.yun.opern.service.serviceImpl;

import com.yun.opern.dao.CollectionInfoDao;
import com.yun.opern.model.BaseResponse;
import com.yun.opern.model.OpernInfo;
import com.yun.opern.model.collection.*;
import com.yun.opern.model.opern.BaseOpernInfo;
import com.yun.opern.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("CollectionService")
public class CollectionServiceImpl implements CollectionService{

    @Autowired
    private CollectionInfoDao collectionInfoDao;

    @Override
    public BaseResponse isCollected(IsCollectedRequest request) {
        BaseResponse response = new BaseResponse();
        CollectionInfo collectionInfo = collectionInfoDao.getUserCollectionInfo(request.getUserId(), request.getOpernId());
        response.setCode(collectionInfo == null ? BaseResponse.RETURN_FAIL : BaseResponse.RETURN_SUCCESS);
        response.setMessage(collectionInfo == null ? BaseResponse.FAIL_STRING : BaseResponse.SUCCESS_STRING);
        return response;
    }

    @Override
    public BaseResponse addCollection(AddCollectionRequest request) {
        BaseResponse response = new BaseResponse();
        int count = collectionInfoDao.addCollectionInfo(request.getUserId(), request.getOpernId());
        response.setCode(count == 0 ? BaseResponse.RETURN_FAIL : BaseResponse.RETURN_SUCCESS);
        response.setMessage(count == 0 ? BaseResponse.FAIL_STRING : BaseResponse.SUCCESS_STRING);
        return response;
    }

    @Override
    public BaseResponse removeCollection(RemoveCollectionRequest request) {
        BaseResponse response = new BaseResponse();
        int count = collectionInfoDao.removeCollectionInfo(request.getUserId(), request.getOpernId());
        response.setCode(count == 0 ? BaseResponse.RETURN_FAIL : BaseResponse.RETURN_SUCCESS);
        response.setMessage(count == 0 ? BaseResponse.FAIL_STRING : BaseResponse.SUCCESS_STRING);
        return response;
    }

    @Override
    public BaseResponse getCollection(GetCollectionRequest request) {
        BaseResponse<ArrayList<CollectionInfo>> baseResponse = new BaseResponse<>();
        ArrayList<CollectionInfo> collectionInfoArrayList = collectionInfoDao.getUserAllCollectionInfo(request.getUserId());
        baseResponse.setCode(BaseResponse.RETURN_SUCCESS);
        baseResponse.setMessage(BaseResponse.SUCCESS_STRING);
        baseResponse.setData(collectionInfoArrayList);
        return baseResponse;
    }

    @Override
    public BaseResponse getCollectionOpern(GetCollectionOpernRequest request) {
        BaseResponse<ArrayList<OpernInfo>> response = new BaseResponse<>();
        ArrayList<BaseOpernInfo> baseOpernInfos = collectionInfoDao.getCollectionOpernInfo(request.getUserId());
        ArrayList<OpernInfo> opernInfoArrayList = OpernInfoServiceImpl.getOpernInfoListFromBaseOpernInfo(baseOpernInfos);
        response.setCode(BaseResponse.RETURN_SUCCESS);
        response.setMessage(BaseResponse.SUCCESS_STRING);
        response.setData(opernInfoArrayList);
        return response;
    }
}
