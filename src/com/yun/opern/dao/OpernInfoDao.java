package com.yun.opern.dao;


import com.yun.opern.model.OpernInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by Yun on 2017/7/3 0003.
 */
@Repository
public interface OpernInfoDao {

    ArrayList<OpernInfo> getAllOpernInfo();

    ArrayList<OpernInfo> getPopularOpernInfo(int dataStart, int dataEnd);

    ArrayList<OpernInfo> searchOpernInfo(@Param("searchParameter") String searchParameter, @Param("dataStart") int dataStart, @Param("dataEnd") int dataEnd);

}
