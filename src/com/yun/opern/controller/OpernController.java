package com.yun.opern.controller;

import com.yun.opern.model.DTO.req.GetOrderedOpernReq;
import com.yun.opern.model.DTO.req.GetRandomOpernReq;
import com.yun.opern.model.DTO.req.SearchOpernReq;
import com.yun.opern.model.DTO.res.BaseResponseDTO;
import com.yun.opern.model.DTO.res.OpernInfoDTO;
import com.yun.opern.service.IOpernInfoService;
import com.yun.opern.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/opern")
public class OpernController {


    @Autowired
    private IOpernInfoService opernInfoService;

    /**
     * 按照浏览量获取曲谱
     *
     * @param request 请求参数
     * @return 曲谱信息
     */
    @RequestMapping(value = "/orderedOpern", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponseDTO<List<OpernInfoDTO>> getOrderedOpern(@RequestBody GetOrderedOpernReq request) {
        BaseResponseDTO<List<OpernInfoDTO>> baseResponseDTO = new BaseResponseDTO<>();
        int pageNum = request.getPageNum();
        int pageSize = request.getPageSize();
        if (pageNum < 0) {
            pageNum = 0;
        }
        if (pageSize <= 0) {
            pageSize = 20;
        }
        List<OpernInfoDTO> opernInfoDTOList = opernInfoService.listOpernInfoOrderByViewCount(pageNum, pageSize);
        baseResponseDTO.setCode(1);
        baseResponseDTO.setMessage("查询成功");
        baseResponseDTO.setData(opernInfoDTOList);
        return baseResponseDTO;
    }

    /**
     * 随机获取曲谱
     * @param request 请求参数
     * @return 曲谱信息
     */
    @RequestMapping(value = "/randomOpern", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponseDTO<List<OpernInfoDTO>> getRandomOpern(@RequestBody GetRandomOpernReq request) {
        BaseResponseDTO<List<OpernInfoDTO>> baseResponseDTO = new BaseResponseDTO<>();
        int pageSize = request.getPageSize();
        if (pageSize <= 0) {
            pageSize = 20;
        }
        List<OpernInfoDTO> opernInfoDTOList = opernInfoService.listRandomOpernInfo(pageSize);
        baseResponseDTO.setCode(1);
        baseResponseDTO.setMessage("查询成功");
        baseResponseDTO.setData(opernInfoDTOList);
        return baseResponseDTO;
    }

    /**
     * 搜索曲谱
     * @param request 请求参数
     * @return 曲谱信息
     */
    @RequestMapping(value = "/searchOpern", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponseDTO<List<OpernInfoDTO>> searchOpern(@RequestBody SearchOpernReq request) {
        BaseResponseDTO<List<OpernInfoDTO>> baseResponseDTO = new BaseResponseDTO<>();
        String searchParameter = request.getSearchParameter();
        if (StringUtil.isNull(searchParameter)) {
            baseResponseDTO.setCode(2);
            baseResponseDTO.setMessage("搜索参数有误");
            return baseResponseDTO;
        }
        int pageNum = request.getPageNum();
        int pageSize = request.getPageSize();
        if (pageNum < 0) {
            pageNum = 0;
        }
        if (pageSize <= 0) {
            pageSize = 20;
        }
        List<OpernInfoDTO> opernInfoDTOList = opernInfoService.searchOpernInfo(searchParameter, pageNum, pageSize);
        baseResponseDTO.setCode(1);
        baseResponseDTO.setMessage("查询成功");
        baseResponseDTO.setData(opernInfoDTOList);
        return baseResponseDTO;
    }
}
