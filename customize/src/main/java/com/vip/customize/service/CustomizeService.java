package com.vip.customize.service;

import com.vip.customize.utils.Bean;

public interface CustomizeService {
//    Bean find(Double budget,String autoType,String standard,int uid);
    Bean save(Double budget,String autoType,String standard,int uid,int num,String brand);
//    Bean update(int num);
}
