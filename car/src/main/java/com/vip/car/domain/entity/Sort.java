package com.vip.car.domain.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Sort {
    /**
    * 分类id
    */
    private Integer soId;

    /**
    * 分类名字
    */
    private String soName;

    /**
    * 0正常,1删除
    */
    private Integer isDelete;
}