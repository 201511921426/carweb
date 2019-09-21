package com.vip.shopcar.utils;




import com.vip.shopcar.domain.entity.Orders;
import com.vip.shopcar.domain.entity.Shopcar;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Bean implements Serializable {
    List<Shopcar> shopcarList;
    int rows;
    List<Orders> ordersList;

}
