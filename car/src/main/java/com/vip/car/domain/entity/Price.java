package com.vip.car.domain.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
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