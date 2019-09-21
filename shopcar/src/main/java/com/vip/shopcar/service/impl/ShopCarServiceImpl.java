package com.vip.shopcar.service.impl;

import com.vip.shopcar.domain.entity.Shopcar;
import com.vip.shopcar.mapper.ShopcarMapper;
import com.vip.shopcar.service.ShopCarService;
import com.vip.shopcar.utils.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShopCarServiceImpl implements ShopCarService {
    @Resource
    ShopcarMapper shopcarMapper;
    @Override
    public Bean findAll(int uid) {
        Bean bean = new Bean();
        List<Shopcar> shopcarList = shopcarMapper.findAll(uid);
        bean.setShopcarList(shopcarList);
        return bean;
    }

    @Override
    public Bean updateById(int uid, int number, int carId) {
        Bean bean = new Bean();
        Shopcar shopcar = shopcarMapper.findCar(uid, carId);
        if (shopcar!=null){
            Integer number1 = shopcar.getNumber();
            int row = shopcarMapper.updateById(uid, number + number1, carId);
            bean.setRows(row);
            return bean;
        }
        return bean;
    }

    @Override
    public Bean updateByIsDelete(int uid, int carId) {
        Bean bean = new Bean();
        int row = shopcarMapper.updateByIsDelete(uid, carId);
        bean.setRows(row);
        return bean;
    }
}
