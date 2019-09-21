package com.vip.car.domain.vo;

import com.vip.car.domain.entity.*;
import lombok.Data;

@Data
public class CarVo extends Car {
    private Brand brand;
    private Price price;
    private AotoType aotoType;
    private Standard standard;
}
