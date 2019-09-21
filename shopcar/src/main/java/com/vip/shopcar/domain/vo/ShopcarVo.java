package com.vip.shopcar.domain.vo;

import com.vip.shopcar.domain.entity.Car;
import com.vip.shopcar.domain.entity.Shopcar;
import com.vip.shopcar.domain.entity.User;
import lombok.Data;

import java.util.List;
@Data
public class ShopcarVo extends Shopcar {
    List<User>  userList;
    List<Car>  carList;
}
