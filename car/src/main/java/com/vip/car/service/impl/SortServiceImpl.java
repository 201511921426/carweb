package com.vip.car.service.impl;

import com.vip.car.domain.vo.SortVo;
import com.vip.car.mapper.SortMapper;
import com.vip.car.service.SortService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SortServiceImpl implements SortService {
    @Resource
    SortMapper sortMapper;
    @Override
    public List<SortVo> findSort() {
        List<SortVo> sort = sortMapper.findSort();
        return sort;
    }
}
