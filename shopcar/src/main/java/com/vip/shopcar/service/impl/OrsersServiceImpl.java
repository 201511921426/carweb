package com.vip.shopcar.service.impl;

import com.vip.shopcar.domain.entity.Orders;
import com.vip.shopcar.domain.entity.Shopcar;
import com.vip.shopcar.mapper.OrdersMapper;
import com.vip.shopcar.mapper.ShopcarMapper;
import com.vip.shopcar.service.OrdersService;
import com.vip.shopcar.utils.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrsersServiceImpl implements OrdersService {
    @Resource
    OrdersMapper ordersMapper;
    @Resource
    ShopcarMapper shopcarMapper;
    @Override
    public Bean FindOrder(int uid, int carId) {
        Bean bean = new Bean();
        List<Orders> orders = ordersMapper.findOrders(uid, carId);
        bean.setOrdersList(orders);
        return bean;
    }

    @Override
    public Bean save(int uid, int carId, double prices, int number,int shopcarId) {
        Bean bean = new Bean();
        Orders order = ordersMapper.findOrder(uid, carId, shopcarId);
        if (order!=null){
            Integer number1 = order.getNumber();
            int row = ordersMapper.update1(uid, carId, prices*(number+number1),number+number1, shopcarId);
            bean.setRows(row);
            return bean;
        }else {
            int row = ordersMapper.save(uid, carId, prices * number, number,shopcarId);
            bean.setRows(row);
            return bean;
        }

    }

    @Override
    public Bean update(int uid, int carId,int shopcarId) {
        Bean bean = new Bean();
        int row = ordersMapper.update(uid, carId,shopcarId);
        bean.setRows(row);
        return bean;
    }
}
