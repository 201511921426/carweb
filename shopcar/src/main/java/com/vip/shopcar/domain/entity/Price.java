package com.vip.shopcar.domain.entity;

import lombok.Data;

@Data
public class Price {
    /**
    * 价格ID
    */
    private Integer priceId;

    /**
    * 价格范围
    */
    private String price;
}