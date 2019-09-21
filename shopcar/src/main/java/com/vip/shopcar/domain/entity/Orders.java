package com.vip.shopcar.domain.entity;

import lombok.Data;

@Data
public class Orders {
    /**
    * 主键
    */
    private Integer carorderId;

    /**
    * 外键
    */
    private Integer uid;

    /**
    * 外键
    */
    private Integer carId;

    private Double totalPrice;

    private Byte isDelete;

    private Integer number;

    private Integer shopcarId;
}