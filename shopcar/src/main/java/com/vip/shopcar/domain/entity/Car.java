package com.vip.shopcar.domain.entity;

import lombok.Data;

@Data
public class Car {
    /**
    * 主键
    */
    private Integer carId;

    /**
    * 外键
    */
    private Integer autotypeId;

    /**
    * 外键
    */
    private Integer brandId;

    /**
    * 外键
    */
    private Integer colorId;

    /**
    * 外键
    */
    private Integer standardId;

    /**
    * 外键
    */
    private Integer priceId;

    private Integer num;

    private Byte isDelete;

    private String carname;

    private Double prices;
}