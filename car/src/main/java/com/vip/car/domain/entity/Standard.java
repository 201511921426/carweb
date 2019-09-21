package com.vip.car.domain.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Standard {
    /**
    * 排放标准
    */
    private Integer standardId;

    /**
    * 内容
    */
    private String types;
}