package com.vip.customize.controller;


import com.vip.customize.service.CustomizeService;
import com.vip.customize.utils.Bean;
import com.vip.customize.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/1")
public class CustomizeController {
    @Resource
    CustomizeService customizeService;

    @RequestMapping("/11")
    public Result save(Double budget, String autoType, String standard, int uid, int num,String brand){
        try {
            Bean bean = customizeService.save(budget, autoType, standard, uid, num, brand);
            return Result.success(bean);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }
}
