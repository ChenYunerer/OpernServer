package com.yun.opern.controller;

import com.yun.opern.model.DTO.AddCollectionReq;
import com.yun.opern.model.DTO.BaseResponseDTO;
import com.yun.opern.service.ICollectionInfoService;
import com.yun.opern.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/collection")
public class CollectionController {


    @Autowired
    private ICollectionInfoService collectionInfoService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponseDTO addCollection(@RequestBody AddCollectionReq request) {
        BaseResponseDTO baseResponseDTO = new BaseResponseDTO();
        int userId = request.getUserId();
        String opernId = request.getOpernId();
        if (userId == 0) {
            baseResponseDTO.setCode(2);
            baseResponseDTO.setMessage("请求参数有误");
            return baseResponseDTO;
        }
        if (StringUtil.isNull(opernId)) {
            baseResponseDTO.setCode(2);
            baseResponseDTO.setMessage("请求参数有误");
            return baseResponseDTO;
        }
        boolean success = collectionInfoService.addCollection(request.getUserId(), request.getOpernId());

        return baseResponseDTO;
    }
}
