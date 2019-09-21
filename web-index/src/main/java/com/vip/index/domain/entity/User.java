package com.vip.index.domain.entity;


import lombok.Data;

@Data
public class User {
    /**
    * 用户id
    */
    private Integer uid;

    /**
    * 用户名
    */
    private String username;

    /**
    * 用户密码
    */
    private String password;

    /**
    * 性别
    */
    private String sex;

    /**
    * 电话
    */
    private String phone;

    /**
    * 0代表未注销,1代表已注销
    */
    private Byte isDelete;
}