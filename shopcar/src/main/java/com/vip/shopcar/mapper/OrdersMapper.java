package com.vip.shopcar.mapper;

import com.vip.shopcar.domain.entity.Orders;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdersMapper {
    int save(@Param("uid") int uid,@Param("carId")int carId,@Param("totalPrice")double totalPrice,@Param("number")int number,@Param("shopcarId")int shopcarId);
    int update(@Param("uid")int uid,@Param("carId")int carId,@Param("shopcarId")int shopcarId);
    List<Orders> findOrders(@Param("uid")int uid,@Param("carId")int carId);
    Orders findOrder(@Param("uid")int uid,@Param("carId")int carId,@Param("shopcarId")int shopcarId);
    int update1(@Param("uid") int uid,@Param("carId")int carId,@Param("totalPrice")double totalPrice,@Param("number")int number,@Param("shopcarId")int shopcarId);
}