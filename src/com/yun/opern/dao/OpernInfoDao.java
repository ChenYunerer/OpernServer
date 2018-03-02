package com.yun.opern.dao;

import com.yun.opern.model.DO.OpernInfoDO;

public interface OpernInfoDao {

    /**
     * 通过曲谱id获取曲谱信息
     *
     * @param id 在自己平台的id非第三方平台
     * @return 曲谱信息
     */
    OpernInfoDO getOpernInfoById(int id);

}
