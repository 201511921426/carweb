package com.vip.car.domain.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Brand {
    /**
    * 品牌id
    */
    private Integer brandId;

    /**
    * 品牌名
    */
    private String brandName;
}