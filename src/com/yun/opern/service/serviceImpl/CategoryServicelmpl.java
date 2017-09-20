package com.yun.opern.service.serviceImpl;

import com.yun.opern.common.CategoryUtil;
import com.yun.opern.dao.CategoryInfoDao;
import com.yun.opern.model.BaseResponse;
import com.yun.opern.model.category.BaseCategoryInfo;
import com.yun.opern.model.category.CategoryInfo;
import com.yun.opern.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Hashtable;

@Service("CategoryService")
public class CategoryServicelmpl implements CategoryService {

    @Autowired
    private CategoryInfoDao categoryInfoDao;

    private Hashtable<String, BaseResponse> categoryCache = new Hashtable<>();

    @Override
    public BaseResponse getCategoryInfo() {
        BaseResponse<ArrayList<CategoryInfo>> response = new BaseResponse<>();
        ArrayList<BaseCategoryInfo> baseCategoryInfos = categoryInfoDao.getBaseCategoryInfo();
        ArrayList<CategoryInfo> categoryInfos = new CategoryUtil().getCategoryInfoListFromBaseCategoryInfoList(baseCategoryInfos);
        response.setCode(BaseResponse.RETURN_SUCCESS);
        response.setMessage(BaseResponse.SUCCESS_STRING);
        response.setData(categoryInfos);
        return response;
    }


}
