package com.vip.shopcar.service;

import com.vip.shopcar.utils.Bean;

public interface OrdersService {
    Bean FindOrder(int uid,int carId);
    Bean save(int uid,int carId,double prices,int number,int shopcarId);
    Bean update(int uid,int carId,int shopcarId);
}

