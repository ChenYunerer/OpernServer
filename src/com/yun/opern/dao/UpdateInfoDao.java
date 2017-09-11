package com.yun.opern.dao;

import com.yun.opern.model.update.UpdateInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface UpdateInfoDao {
    
    UpdateInfo getLastUpdateInfo();
}
