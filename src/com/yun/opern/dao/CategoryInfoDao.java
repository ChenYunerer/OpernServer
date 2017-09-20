package com.yun.opern.dao;

import com.yun.opern.model.category.BaseCategoryInfo;

import java.util.ArrayList;

public interface CategoryInfoDao {
    /**
     * 获取基础类目信息
     * @return
     */
    ArrayList<BaseCategoryInfo> getBaseCategoryInfo();
}
