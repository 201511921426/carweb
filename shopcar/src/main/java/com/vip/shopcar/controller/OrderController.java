package com.vip.shopcar.controller;

import com.vip.shopcar.service.OrdersService;
import com.vip.shopcar.utils.Bean;
import com.vip.shopcar.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RequestMapping("/2")
@RestController
public class OrderController {
    @Resource
    OrdersService ordersService;
    @RequestMapping("/22")
    public Result findOrder(int uid,int carId){
        try {
            Bean bean = ordersService.FindOrder(uid, carId);
            return Result.success(bean);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }
    @RequestMapping("/23")
    public Result save(int uid,int carId,double prices,int number,int shopcarId){
        try {
            Bean bean = ordersService.save(uid,carId,prices,number,shopcarId);
            return Result.success(bean);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }
    @RequestMapping("/24")
    public Result update(int uid,int carId,int shopcarId){
        try {
            Bean bean = ordersService.update(uid,carId,shopcarId);
            return Result.success(bean);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }
}
