package com.yun.opern.dao;

import com.yun.opern.model.OpernTempInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface OpernTempInfoDao {

    OpernTempInfo getLastOpernTempInfo();
}
