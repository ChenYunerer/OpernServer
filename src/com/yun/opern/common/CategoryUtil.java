package com.yun.opern.common;

import com.yun.opern.model.category.BaseCategoryInfo;
import com.yun.opern.model.category.CategoryInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CategoryUtil {

    public ArrayList<CategoryInfo> getCategoryInfoListFromBaseCategoryInfoList (ArrayList<BaseCategoryInfo> baseCategoryInfos){
        Map<String, ArrayList<String>> map = new HashMap<>();
        baseCategoryInfos.forEach(item -> {
            ArrayList<String> categoryTwos = map.get(item.getCategoryOne());
            if(categoryTwos == null){
                categoryTwos = new ArrayList<>();
                categoryTwos.add(item.getCategoryTwo());
                map.put(item.getCategoryOne(), categoryTwos);
            }else {
                categoryTwos.add(item.getCategoryTwo());
            }
        });
        ArrayList<CategoryInfo> categoryInfos = new ArrayList<>();
        map.keySet().forEach(key -> {
            CategoryInfo categoryInfo = new CategoryInfo();
            categoryInfo.setCategory(key);
            ArrayList<CategoryInfo> list = new ArrayList<>();
            categoryInfo.setCategoryInfos(list);
            map.get(key).forEach(item -> list.add(new CategoryInfo(item, null)));
            categoryInfos.add(categoryInfo);
        });
        return categoryInfos;
    }
}
