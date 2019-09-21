package com.vip.customize.domain.entity;

import lombok.Data;

@Data
public class Customize {
    /**
    * 私人定制ID
    */
    private Integer customizeId;

    /**
    * 预算
    */
    private Double budget;

    /**
    * 车型
    */
    private String autoType;

    /**
    * 排放标准
    */
    private String standard;

    /**
    * 用户id
    */
    private Integer uid;

    private Integer num;

    private String  brand;
}