package com.vip.shopcar.service;

import com.vip.shopcar.utils.Bean;

public interface ShopCarService {
    Bean findAll(int uid);
    Bean updateById(int uid,int number,int carId);
    Bean updateByIsDelete(int uid,int carId);

}
