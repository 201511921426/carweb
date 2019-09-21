package com.vip.car.service.impl;


import com.vip.car.domain.entity.Car;
import com.vip.car.mapper.CarMapper;
import com.vip.car.service.CarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Resource
    CarMapper carMapper;
    @Override
    public List<Car> findById(Integer brandId, Integer priceId, Integer autotypeId, Integer standardId, int page, Integer size) {
        if (size == null || "".equals(size)){
            size = 1;
        }
        page -= 1;
        List<Car> cars = carMapper.findById(brandId, priceId, autotypeId, standardId, page, size);
        return cars;
    }
}
