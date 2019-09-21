package com.vip.car.domain.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Car {
    /**
    * 主键
    */
    private Integer carId;

    private Integer autotypeId;

    private Integer brandId;

    private Integer colorId;

    private Integer standardId;

    private Integer priceId;

    private Integer num;

    private Byte isDelete;

    private String carname;

    private Double prices;
}