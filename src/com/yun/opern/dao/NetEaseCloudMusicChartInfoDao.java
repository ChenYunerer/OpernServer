package com.yun.opern.dao;

import com.yun.opern.model.netease.NetEaseCloudMusicChartInfo;
import com.yun.opern.model.user.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface NetEaseCloudMusicChartInfoDao {
    
    ArrayList<NetEaseCloudMusicChartInfo> musicChart();
}
