package com.yun.opern.controller;

import com.yun.opern.model.BaseResponse;
import com.yun.opern.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/category")
public class CategoryController {
    private Logger logger = LoggerFactory.getLogger(CategoryController.class);

    @Resource(name = "CategoryService")
    private CategoryService categoryService;


    @RequestMapping(value = "/categoryInfo", method = RequestMethod.GET)
    public BaseResponse getCategoryInfo() {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        logger.info(methodName + "--start");
        BaseResponse response = new BaseResponse();
        try {
            response = categoryService.getCategoryInfo();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(BaseResponse.RETURN_FAIL);
            response.setMessage(e.getMessage());
        }

        logger.info(methodName + "--end");
        return response;
    }

}
