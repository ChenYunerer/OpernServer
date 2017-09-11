package com.yun.opern.service.serviceImpl;

import com.yun.opern.dao.UpdateInfoDao;
import com.yun.opern.model.BaseResponse;
import com.yun.opern.model.update.UpdateInfo;
import com.yun.opern.service.UpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UpdateService")
public class UpdateServiceImpl implements UpdateService {

    @Autowired
    private UpdateInfoDao updateInfoDao;

    @Override
    public BaseResponse checkVersion() {
        BaseResponse<UpdateInfo> baseResponse = new BaseResponse<>();
        UpdateInfo updateInfo = updateInfoDao.getLastUpdateInfo();
        baseResponse.setData(updateInfo);
        baseResponse.setCode(BaseResponse.RETURN_SUCCESS);
        baseResponse.setMessage(BaseResponse.SUCCESS_STRING);
        return baseResponse;
    }
}
