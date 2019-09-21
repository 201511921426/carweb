package com.vip.car.domain.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.vip.car.domain.entity.*;
import lombok.Data;

import java.util.List;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SortVo extends Sort {
    List<Brand> brands;
    List<Price> prices;
    List<AotoType> aotoTypes;
    List<Standard> standards;

}
