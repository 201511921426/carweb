package com.vip.shopcar.controller;

import com.vip.shopcar.service.ShopCarService;
import com.vip.shopcar.utils.Bean;
import com.vip.shopcar.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RequestMapping("/1")
@RestController
public class ShopCarController {
    @Resource
    ShopCarService shopCarService;
    @RequestMapping("/11")
    public Result findAll(int uid){
        try {
            Bean bean = shopCarService.findAll(uid);
            return Result.success(bean);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }

    @RequestMapping("/12")
    public Result update(int uid,int number,int carId){
        try {
            Bean bean = shopCarService.updateById(uid, number, carId);
            return Result.success(bean);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }

    @RequestMapping("/13")
    public Result updateByIsDelete(int uid,int carId){
        try {
            Bean bean = shopCarService.updateByIsDelete(uid, carId);
            return Result.success(bean);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }

}
