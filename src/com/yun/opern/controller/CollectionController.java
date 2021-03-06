package com.yun.opern.controller;

import com.yun.opern.model.DO.UserCollectionInfoDO;
import com.yun.opern.model.DTO.req.AddCollectionReq;
import com.yun.opern.model.DTO.req.GetCollectionReq;
import com.yun.opern.model.DTO.req.IsCollectedReq;
import com.yun.opern.model.DTO.req.RemoveCollectionReq;
import com.yun.opern.model.DTO.res.BaseResponseDTO;
import com.yun.opern.model.DTO.res.OpernInfoDTO;
import com.yun.opern.service.ICollectionInfoService;
import com.yun.opern.service.IOpernInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/collection")
public class CollectionController {

    @Autowired
    private ICollectionInfoService collectionInfoService;

    @Autowired
    private IOpernInfoService opernInfoService;

    /**
     * 添加收藏
     *
     * @param request 请求参数
     * @return BaseResponse
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponseDTO addCollection(@RequestBody AddCollectionReq request) {
        BaseResponseDTO baseResponseDTO = new BaseResponseDTO();
        long userId = request.getUserId();
        int opernId = request.getOpernId();
        if (userId == 0) {
            baseResponseDTO.setCode(2);
            baseResponseDTO.setMessage("请求参数有误");
            return baseResponseDTO;
        }
        if (opernId == 0) {
            baseResponseDTO.setCode(2);
            baseResponseDTO.setMessage("请求参数有误");
            return baseResponseDTO;
        }
        boolean exist = opernInfoService.isOpernInfoExist(opernId);
        if (!exist) {
            baseResponseDTO.setCode(2);
            baseResponseDTO.setMessage("该曲谱不存在");
            return baseResponseDTO;
        }
        boolean collected = collectionInfoService.isCollectionExist(userId, opernId);
        if (collected) {
            baseResponseDTO.setCode(2);
            baseResponseDTO.setMessage("已收藏");
            return baseResponseDTO;
        }
        boolean success = collectionInfoService.addCollection(request.getUserId(), request.getOpernId());
        if (success) {
            baseResponseDTO.setCode(1);
            baseResponseDTO.setMessage("收藏成功");
        } else {
            baseResponseDTO.setCode(2);
            baseResponseDTO.setMessage("收藏失败");
        }
        return baseResponseDTO;
    }

    /**
     * 查询收藏信息
     *
     * @param request 请求参数
     * @return 收藏信息
     */
    @RequestMapping(value = "/get", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponseDTO<List<OpernInfoDTO>> getCollection(@RequestBody GetCollectionReq request) {
        BaseResponseDTO<List<OpernInfoDTO>> baseResponseDTO = new BaseResponseDTO<>();
        long userId = request.getUserId();
        if (userId == 0) {
            baseResponseDTO.setCode(2);
            baseResponseDTO.setMessage("请求参数有误");
            return baseResponseDTO;
        }
        List<OpernInfoDTO> opernInfoDTOList = collectionInfoService.getCollection(userId);
        baseResponseDTO.setCode(1);
        baseResponseDTO.setMessage("查询成功");
        baseResponseDTO.setData(opernInfoDTOList);
        return baseResponseDTO;
    }


    /**
     * 删除收藏信息
     *
     * @param request 请求参数
     * @return 返回值
     */
    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponseDTO removeCollection(@RequestBody RemoveCollectionReq request) {
        BaseResponseDTO baseResponseDTO = new BaseResponseDTO();
        long userId = request.getUserId();
        int opernId = request.getOpernId();
        if (userId == 0) {
            baseResponseDTO.setCode(2);
            baseResponseDTO.setMessage("请求参数有误");
            return baseResponseDTO;
        }
        if (opernId == 0) {
            baseResponseDTO.setCode(2);
            baseResponseDTO.setMessage("请求参数有误");
            return baseResponseDTO;
        }
        collectionInfoService.removeCollection(userId, opernId);
        baseResponseDTO.setCode(1);
        baseResponseDTO.setMessage("删除成功");
        return baseResponseDTO;
    }

    /**
     * 删除收藏信息
     *
     * @param request 请求参数
     * @return 返回值
     */
    @RequestMapping(value = "/isCollected", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponseDTO<Boolean> isCollected(@RequestBody IsCollectedReq request) {
        BaseResponseDTO<Boolean> baseResponseDTO = new BaseResponseDTO<>();
        long userId = request.getUserId();
        int opernId = request.getOpernId();
        if (userId == 0) {
            baseResponseDTO.setCode(2);
            baseResponseDTO.setMessage("请求参数有误");
            return baseResponseDTO;
        }
        if (opernId == 0) {
            baseResponseDTO.setCode(2);
            baseResponseDTO.setMessage("请求参数有误");
            return baseResponseDTO;
        }
        boolean collected = collectionInfoService.isCollectionExist(userId, opernId);
        baseResponseDTO.setCode(1);
        baseResponseDTO.setMessage("删除成功");
        baseResponseDTO.setData(collected);
        return baseResponseDTO;
    }
}
