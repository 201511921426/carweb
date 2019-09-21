package com.vip.car.utils;

import lombok.Data;

@Data
public class Result<T> {
    private String msg;
    private int status;
    private T data;

    public static Result success(Object obj) {
        Result result = new Result();
        result.setStatus(config.SUCCESS_STATUS_200);
        result.setData(obj);
        result.setMsg(config.SUCCESS_MSG);
        return result;
    }


    public static Result error() {
        Result result = new Result();
        result.setStatus(config.ERROR_STATUS_404);
        result.setMsg(config.ERROR_MSG);
        return result;
    }
}
