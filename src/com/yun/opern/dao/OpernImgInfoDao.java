package com.yun.opern.dao;


import com.yun.opern.model.OpernImgInfo;
import com.yun.opern.model.OpernInfo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by Yun on 2017/7/3 0003.
 */
@Repository
public interface OpernImgInfoDao {
    
    ArrayList<OpernImgInfo> getOpernImgInfo(int opernId);
    
}
