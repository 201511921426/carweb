package com.vip.car.mapper;

import com.vip.car.domain.entity.Car;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarMapper {
   List<Car> findById(@Param("brandId") Integer brandId, @Param("priceId") Integer priceId,
                      @Param("autotypeId") Integer autotypeId, @Param("standardId") Integer standardId,
                      @Param("page") int page, @Param("size") int size);
}