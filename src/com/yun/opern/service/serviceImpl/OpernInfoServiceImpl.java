package com.yun.opern.service.serviceImpl;

import com.yun.opern.common.OpernUtil;
import com.yun.opern.dao.OpernImgInfoDao;
import com.yun.opern.dao.OpernInfoDao;
import com.yun.opern.model.BaseResponse;
import com.yun.opern.model.OpernImgInfo;
import com.yun.opern.model.OpernInfo;
import com.yun.opern.model.opern.BaseOpernInfo;
import com.yun.opern.model.opern.GetPopularOpernInfoRequest;
import com.yun.opern.model.opern.SearchOpernInfoByCategoryRequest;
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


    /**
     * 获取所有曲谱
     * @return
     */
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

    /**
     * 获取曲谱（按照浏览量排序，分页）
     * @param request
     * @return
     */
    @Override
    public BaseResponse getPopularOpernInfo(GetPopularOpernInfoRequest request) {
        int dataStart = request.getIndex() * request.getNumPerPage();
        int dataEnd = dataStart + request.getNumPerPage();
        BaseResponse<ArrayList<OpernInfo>> response = new BaseResponse<>();
        ArrayList<BaseOpernInfo> baseOpernInfos = opernInfoDao.getPopularOpernInfo(dataStart, dataEnd);
        ArrayList<OpernInfo> opernInfoArrayList = new OpernUtil().getOpernInfoListFromBaseOpernInfo(baseOpernInfos);
        response.setCode(BaseResponse.RETURN_SUCCESS);
        response.setMessage("请求数据成功");
        response.setData(opernInfoArrayList);
        return response;
    }

    /**
     * 通过类目获取曲谱信息（按照浏览量排序，分页）
     * @param request
     * @return
     */
    @Override
    public BaseResponse searchOpernInfoByCategory(SearchOpernInfoByCategoryRequest request) {
        int dataStart = request.getIndex() * request.getNumPerPage();
        int dataEnd = dataStart + request.getNumPerPage();
        BaseResponse<ArrayList<OpernInfo>> response = new BaseResponse<>();
        ArrayList<BaseOpernInfo> baseOpernInfos = opernInfoDao.getOpernInfoByCategory(request.getCategoryOne(), request.getCategoryTwo(), dataStart, dataEnd);
        ArrayList<OpernInfo> opernInfoArrayList = new OpernUtil().getOpernInfoListFromBaseOpernInfo(baseOpernInfos);
        response.setCode(BaseResponse.RETURN_SUCCESS);
        response.setMessage("请求数据成功");
        response.setData(opernInfoArrayList);
        return response;
    }

    /**
     * 搜索曲谱（搜索结构按照浏览量排序，最大返回50条数据）
     * @param request
     * @return
     */
    @Override
    public BaseResponse searchOpernInfo(SearchOpernInfoRequest request) {
        BaseResponse<ArrayList<OpernInfo>> response = new BaseResponse<>();
        ArrayList<BaseOpernInfo> baseOpernInfos = opernInfoDao.searchOpernInfo(request.getSearchParameter());
        ArrayList<OpernInfo> opernInfoArrayList = new OpernUtil().getOpernInfoListFromBaseOpernInfo(baseOpernInfos);
        response.setCode(BaseResponse.RETURN_SUCCESS);
        response.setMessage("请求数据成功");
        response.setData(opernInfoArrayList);
        return response;
    }


}
