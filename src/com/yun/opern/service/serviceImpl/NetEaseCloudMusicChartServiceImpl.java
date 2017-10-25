package com.yun.opern.service.serviceImpl;

import com.yun.opern.dao.NetEaseCloudMusicChartInfoDao;
import com.yun.opern.model.BaseResponse;
import com.yun.opern.model.netease.NetEaseCloudMusicChartInfo;
import com.yun.opern.model.netease.NetEaseCloudMusicChartMusicInfo;
import com.yun.opern.service.NetEaseCloudMusicChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("NetEaseCloudMusicChartService")
public class NetEaseCloudMusicChartServiceImpl implements NetEaseCloudMusicChartService{

    @Autowired
    NetEaseCloudMusicChartInfoDao netEaseCloudMusicChartInfoDao;

    @Override
    public BaseResponse musicChart() {
        BaseResponse<ArrayList<NetEaseCloudMusicChartInfo>> response = new BaseResponse<>();
        ArrayList<NetEaseCloudMusicChartInfo> data = netEaseCloudMusicChartInfoDao.musicChart();
        response.setCode(BaseResponse.RETURN_SUCCESS);
        response.setMessage(BaseResponse.SUCCESS_STRING);
        response.setData(data);
        return response;
    }

    @Override
    public BaseResponse musicChartMusic(int chartId) {
        BaseResponse<ArrayList<NetEaseCloudMusicChartMusicInfo>> response = new BaseResponse<>();
        ArrayList<NetEaseCloudMusicChartMusicInfo> data = netEaseCloudMusicChartInfoDao.musicChartMusic(chartId);
        data.forEach(netEaseCloudMusicChartMusicInfo -> netEaseCloudMusicChartMusicInfo.setPlayUrl("http://music.163.com/song/media/outer/url?id=" + netEaseCloudMusicChartMusicInfo.getId() + ".mp3"));
        response.setCode(BaseResponse.RETURN_SUCCESS);
        response.setMessage(BaseResponse.SUCCESS_STRING);
        response.setData(data);
        return response;
    }
}
