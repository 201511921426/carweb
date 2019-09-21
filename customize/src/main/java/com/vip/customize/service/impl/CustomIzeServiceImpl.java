package com.vip.customize.service.impl;

import com.vip.customize.domain.entity.Customize;
import com.vip.customize.mapper.CustomizeMapper;
import com.vip.customize.service.CustomizeService;
import com.vip.customize.utils.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CustomIzeServiceImpl implements CustomizeService {

    @Resource
    CustomizeMapper customizeMapper;

    @Override
    public Bean save(Double budget, String autoType, String standard, int uid, int num,String brand) {
        Bean bean = new Bean();
        Customize customize = customizeMapper.findById(budget, autoType, standard, uid, brand);
        if (customize!=null){
            Integer num1 = customize.getNum();
            Integer i = customize.getCustomizeId();
            int row = customizeMapper.update(num+num1,i);
            bean.setRow(row);
            return bean;
        }else {
            int row = customizeMapper.save(budget, autoType, standard, uid, num, brand);
            bean.setRow(row);
            return bean;
        }
    }
}
