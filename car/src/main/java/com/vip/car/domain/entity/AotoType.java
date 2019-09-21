package com.vip.car.domain.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AotoType {
    /**
    * 车型ID
    */
    private Integer autotypeId;

    /**
    * 车型
    */
    private String autotypes;
}