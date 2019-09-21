package com.vip.shopcar.domain.entity;

import lombok.Data;

@Data
public class User {
    /**
    * 用户ID
    */
    private Integer uid;

    /**
    * 用户名
    */
    private String username;

    /**
    * 密码
    */
    private String password;

    /**
    * 手机号
    */
    private Integer phone;

    /**
    * 用户地址
    */
    private String address;
}