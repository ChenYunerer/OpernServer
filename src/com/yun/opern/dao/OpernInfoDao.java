package com.yun.opern.dao;


import com.yun.opern.model.OpernInfo;
import com.yun.opern.model.opern.BaseOpernInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by Yun on 2017/7/3 0003.
 */
@Repository
public interface OpernInfoDao {

    ArrayList<OpernInfo> getAllOpernInfo();

    ArrayList<BaseOpernInfo> getPopularOpernInfo(int dataStart, int dataEnd);

    ArrayList<BaseOpernInfo> getOpernInfoByCategory(@Param("categoryOne") String categoryOne, @Param("categoryTwo") String categoryTwo, @Param("dataStart") int dataStart, @Param("dataEnd") int dataEnd);

    ArrayList<BaseOpernInfo> searchOpernInfo(@Param("searchParameter") String searchParameter);

    ArrayList<BaseOpernInfo> latestUpdateOpernInfo();

}
