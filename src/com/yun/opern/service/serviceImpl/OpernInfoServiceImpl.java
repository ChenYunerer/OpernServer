package com.yun.opern.service.serviceImpl;

import com.yun.opern.dao.OpernInfoDao;
import com.yun.opern.model.DO.BaseOpernInfoDO;
import com.yun.opern.model.DO.OpernInfoDO;
import com.yun.opern.model.DO.OpernPicInfoDO;
import com.yun.opern.model.DTO.res.OpernInfoDTO;
import com.yun.opern.service.IOpernInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OpernInfoServiceImpl implements IOpernInfoService {

    @Autowired
    OpernInfoDao opernInfoDao;

    /**
     * 判断曲谱是否存在
     *
     * @param id 曲谱id
     * @return 是否存在
     */
    @Override
    public boolean isOpernInfoExist(int id) {
        OpernInfoDO opernInfoDO = opernInfoDao.getOpernInfoById(id);
        return opernInfoDO != null;
    }

    /**
     * 获取曲谱信息 按照浏览量排序
     *
     * @param pageNum  分页页码
     * @param pageSize 分页大小
     * @return 曲谱数据
     */
    @Override
    public List<OpernInfoDTO> listOpernInfoOrderByViewCount(int pageNum, int pageSize) {
        int start = pageNum * pageSize;
        int size = pageSize;
        List<BaseOpernInfoDO> baseOpernInfoDOList = opernInfoDao.listOpernInfoOrderByViewCount(start, size);
        List<OpernInfoDTO> opernInfoDTOList = baseOpernInfo2OpernInfo(baseOpernInfoDOList);
        return opernInfoDTOList;
    }

    /**
     * 获取曲谱信息 随机
     *
     * @param pageSize 分页大小
     * @return 曲谱数据
     */
    @Override
    public List<OpernInfoDTO> listRandomOpernInfo(int pageSize) {
        int count = opernInfoDao.countOpernInfo();
        int start = (int) (Math.random() * count);
        List<BaseOpernInfoDO> baseOpernInfoDOList = opernInfoDao.listOpernInfoOrderByViewCount(start, pageSize);
        List<OpernInfoDTO> opernInfoDTOList = baseOpernInfo2OpernInfo(baseOpernInfoDOList);
        return opernInfoDTOList;
    }

    /**
     * 搜索曲谱
     *
     * @param searchParameter 搜索参数 曲谱名称 曲作者 词作者
     * @param pageNum         分页页码
     * @param pageSize        分页大小
     * @return 曲谱数据
     */
    @Override
    public List<OpernInfoDTO> searchOpernInfo(String searchParameter, int pageNum, int pageSize) {
        int start = pageNum * pageSize;
        int size = pageSize;
        List<BaseOpernInfoDO> baseOpernInfoDOList = opernInfoDao.getOpernInfoBySearchParameter(searchParameter, start, size);
        List<OpernInfoDTO> opernInfoDTOList = baseOpernInfo2OpernInfo(baseOpernInfoDOList);
        return opernInfoDTOList;
    }

    /**
     * list of BaseOpernInfoDO 2 list of OpernInfoDTO
     */
    public static List<OpernInfoDTO> baseOpernInfo2OpernInfo(List<BaseOpernInfoDO> baseOpernInfoDOList) {
        ArrayList<OpernInfoDTO> opernInfoDTOList = new ArrayList<>();
        for (BaseOpernInfoDO info : baseOpernInfoDOList) {
            OpernInfoDTO opernInfo = info.getOpernInfoDTO();
            OpernPicInfoDO opernPicInfo = info.getOpernPicInfoDO();
            int index = opernInfoDTOList.indexOf(opernInfo);
            if (index == -1) {
                opernInfo.getOpernPicInfoList().add(opernPicInfo);
                opernInfoDTOList.add(opernInfo);
            } else {
                opernInfoDTOList.get(index).getOpernPicInfoList().add(opernPicInfo);
            }
        }
        return opernInfoDTOList;
    }
}
