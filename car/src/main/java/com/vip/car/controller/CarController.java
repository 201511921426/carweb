package com.vip.car.controller;

import com.vip.car.domain.entity.Car;
import com.vip.car.service.CarService;
import com.vip.car.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class CarController {
    @Resource
    CarService carService;
    @GetMapping("/car")
    public Result<Car> findById(Integer brandId, Integer priceId, Integer autotypeId, Integer standardId, int page, Integer size){
        try {
            List<Car> cars = carService.findById(brandId, priceId, autotypeId, standardId, page, size);
            return Result.success(cars);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }
}
