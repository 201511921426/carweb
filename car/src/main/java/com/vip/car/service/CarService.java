package com.vip.car.service;


import com.vip.car.domain.entity.Car;

import java.util.List;

public interface CarService {
    List<Car> findById(Integer brandId, Integer priceId, Integer autotypeId, Integer standardId, int page, Integer size);
}
