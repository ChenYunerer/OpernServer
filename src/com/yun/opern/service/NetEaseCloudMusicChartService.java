package com.yun.opern.service;

import com.yun.opern.model.BaseResponse;

public interface NetEaseCloudMusicChartService {

    BaseResponse musicChart();

    BaseResponse musicChartMusic(int chartId);
}
