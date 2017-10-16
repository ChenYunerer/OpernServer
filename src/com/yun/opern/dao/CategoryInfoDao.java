package com.yun.opern.dao;

import com.yun.opern.model.category.BaseCategoryInfo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CategoryInfoDao {
    /**
     * 获取基础类目信息
     * @return
     */
    ArrayList<BaseCategoryInfo> getBaseCategoryInfo();
}
