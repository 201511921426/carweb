package com.vip.shopcar.domain.vo;

import com.vip.shopcar.domain.entity.Car;
import com.vip.shopcar.domain.entity.Orders;
import com.vip.shopcar.domain.entity.Shopcar;
import com.vip.shopcar.domain.entity.User;
import lombok.Data;
import org.springframework.core.annotation.Order;

import java.util.List;

@Data
public class OrdersVo extends Orders {
    List<User> userList;
    List<Car> carList;
    List<Shopcar> shopcarList;
}
