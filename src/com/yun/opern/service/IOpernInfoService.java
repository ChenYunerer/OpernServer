package com.yun.opern.service;

import com.yun.opern.model.DTO.res.OpernInfoDTO;

import java.util.List;

public interface IOpernInfoService {

    boolean isOpernInfoExist(int id);

    List<OpernInfoDTO> listOpernInfoOrderByViewCount(int pageNum, int pageSize);
}
