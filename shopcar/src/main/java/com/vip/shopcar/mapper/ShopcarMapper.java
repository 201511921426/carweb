package com.vip.shopcar.mapper;

import com.vip.shopcar.domain.entity.Shopcar;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopcarMapper {
    List<Shopcar> findAll(@Param("uid")int uid);
    int updateById(@Param("uid")int uid,@Param("number")int number,@Param("carId")int carId);
    Shopcar findCar(@Param("uid")int uid,@Param("carId")int carId);
    int updateByIsDelete(@Param("uid")int uid,@Param("carId")int carId);
}