package com.yun.opern.service.serviceImpl;

import com.yun.opern.dao.OpernImgInfoDao;
import com.yun.opern.dao.OpernInfoDao;
import com.yun.opern.model.BaseResponse;
import com.yun.opern.model.OpernImgInfo;
import com.yun.opern.model.OpernInfo;
import com.yun.opern.model.opern.GetPopularOpernInfoRequest;
import com.yun.opern.model.opern.SearchOpernInfoRequest;
import com.yun.opern.service.OpernInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Yun on 2017/7/3 0003.
 */
@Service("OpernInfoService")
public class OpernInfoServiceImpl implements OpernInfoService {

    @Autowired
    private OpernInfoDao opernInfoDao;

    @Autowired
    private OpernImgInfoDao opernImgInfoDao;


    @Override
    public BaseResponse<ArrayList<OpernInfo>> getAllOpernInfo() {
        BaseResponse<ArrayList<OpernInfo>> response = new BaseResponse<>();
        ArrayList<OpernInfo> opernInfoArrayList = opernInfoDao.getAllOpernInfo();
        for(OpernInfo info : opernInfoArrayList){
            ArrayList<OpernImgInfo> opernImgInfoArrayList = opernImgInfoDao.getOpernImgInfo(info.getId());
            info.setImgs(opernImgInfoArrayList);
        }
        response.setCode(BaseResponse.RETURN_SUCCESS);
        response.setMessage("请求数据成功");
        response.setData(opernInfoArrayList);
        return response;
    }

    @Override
    public BaseResponse getPopularOpernInfo(GetPopularOpernInfoRequest request) {
        int dataStart = request.getIndex() * request.getNumPerPage();
        int dataEnd = dataStart + request.getNumPerPage();
        BaseResponse<ArrayList<OpernInfo>> response = new BaseResponse<>();
        ArrayList<OpernInfo> opernInfoArrayList = opernInfoDao.getPopularOpernInfo(dataStart, dataEnd);
        for(OpernInfo info : opernInfoArrayList){
            ArrayList<OpernImgInfo> opernImgInfoArrayList = opernImgInfoDao.getOpernImgInfo(info.getId());
            info.setImgs(opernImgInfoArrayList);
        }
        response.setCode(BaseResponse.RETURN_SUCCESS);
        response.setMessage("请求数据成功");
        response.setData(opernInfoArrayList);
        return response;
    }

    @Override
    public BaseResponse searchOpernInfo(SearchOpernInfoRequest request) {
        int dataStart = request.getIndex() * request.getNumPerPage();
        int dataEnd = dataStart + request.getNumPerPage();
        BaseResponse<ArrayList<OpernInfo>> response = new BaseResponse<>();
        ArrayList<OpernInfo> opernInfoArrayList = opernInfoDao.searchOpernInfo(request.getSearchParameter(), dataStart, dataEnd);
        for(OpernInfo info : opernInfoArrayList){
            ArrayList<OpernImgInfo> opernImgInfoArrayList = opernImgInfoDao.getOpernImgInfo(info.getId());
            info.setImgs(opernImgInfoArrayList);
        }
        response.setCode(BaseResponse.RETURN_SUCCESS);
        response.setMessage("请求数据成功");
        response.setData(opernInfoArrayList);
        return response;
    }


}
