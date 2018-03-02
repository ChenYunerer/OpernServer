package com.yun.opern.service.serviceImpl;

import com.yun.opern.dao.OpernInfoDao;
import com.yun.opern.model.DO.OpernInfoDO;
import com.yun.opern.service.IOpernInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpernInfoServiceImpl implements IOpernInfoService {

    @Autowired
    OpernInfoDao opernInfoDao;

    @Override
    public boolean isOpernInfoExist(int id) {
        OpernInfoDO opernInfoDO = opernInfoDao.getOpernInfoById(id);
        return opernInfoDO != null;
    }
}
