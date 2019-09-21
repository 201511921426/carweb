package com.vip.shopcar.domain.entity;

import lombok.Data;

@Data
public class Shopcar {
    /**
    * 主键
    */
    private Integer shopcarId;

    /**
    * 外键
    */
    private Integer carId;

    /**
    * 外键
    */
    private Integer uid;

    /**
    * 购买数量
    */
    private Integer number;

    /**
    * 状态
    */
    private Byte isDelete;



}