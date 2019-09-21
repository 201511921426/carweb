package com.vip.car.controller;

import com.vip.car.domain.vo.SortVo;
import com.vip.car.service.SortService;
import com.vip.car.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class SortController {
    @Resource
    SortService sortService;
    @GetMapping("/sort")
    public Result<SortVo> find(){
        try {
            List<SortVo> sort = sortService.findSort();
            return Result.success(sort);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }
}
