package com.yun.opern.common;

import com.yun.opern.model.OpernImgInfo;
import com.yun.opern.model.OpernInfo;
import com.yun.opern.model.opern.BaseOpernInfo;

import java.util.ArrayList;

public class OpernUtil {

    /**
     * 通过baseoperninfolist获取operninfolist
     */
    public ArrayList<OpernInfo> getOpernInfoListFromBaseOpernInfo(ArrayList<BaseOpernInfo> baseOpernInfos){
        ArrayList<OpernInfo> opernInfoArrayList = new ArrayList<>();
        for(BaseOpernInfo info : baseOpernInfos){
            OpernInfo opernInfo = info.getOpernInfo();
            OpernImgInfo opernImgInfo = info.getOpernImgInfo();
            int index = opernInfoArrayList.indexOf(opernInfo);
            if(index == -1){
                opernInfo.getImgs().add(opernImgInfo);
                opernInfoArrayList.add(opernInfo);
            }else {
                opernInfoArrayList.get(index).getImgs().add(opernImgInfo);
            }
        }
        return opernInfoArrayList;
    }
}
