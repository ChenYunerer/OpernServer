package com.yun.opern.dao;

import com.yun.opern.model.DO.OpernInfoDO;
import com.yun.opern.model.DO.OpernPicInfoDO;
import com.yun.opern.model.DTO.res.OpernInfoDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 1） 获取单个对象的方法用 get 做前缀。
 * 2） 获取多个对象的方法用 list 做前缀。
 * 3） 获取统计值的方法用 count 做前缀。
 * 4） 插入的方法用 save（推荐）或 insert 做前缀。
 * 5） 删除的方法用 remove（推荐）或 delete 做前缀。
 * 6） 修改的方法用 update 做前缀。
 */
public interface OpernInfoDao {

    int countOpernInfo();

    /**
     * 通过曲谱id获取曲谱信息
     *
     * @param id 在自己平台的id非第三方平台
     * @return 曲谱信息
     */
    OpernInfoDO getOpernInfoById(int id);

    /**
     * 分页查询曲谱信息(按照浏览量排序)
     *
     * @param start 查询起始位置
     * @param size  查询数量
     * @return 曲谱信息
     */
    List<OpernInfoDTO> listOpernInfoOrderByViewCount(@Param("start") int start, @Param("size") int size);

    /**
     * 通过曲谱id获取谱曲图片信息
     *
     * @param id 在自己平台的id非第三方平台
     * @return 曲谱图片信息
     */
    List<OpernPicInfoDO> getOpernPicInfoById(int id);


    List<OpernInfoDTO> getOpernInfoBySearchParameter(@Param("searchParameter") String searchParameter, @Param("start") int start, @Param("size") int size);

}
