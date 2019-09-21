package com.vip.customize.mapper;

import com.vip.customize.domain.entity.Customize;
import org.apache.ibatis.annotations.Param;

import javax.xml.ws.Service;


public interface CustomizeMapper {
        Customize findById(@Param("budget")Double budget, @Param("autoType")String autoType, @Param("standard")String standard, @Param("uid")int uid, @Param("brand")String brand);
        int save(@Param("budget")Double budget, @Param("autoType")String autoType, @Param("standard")String standard, @Param("uid")int uid, @Param("num")int num,@Param("brand")String brand);
        int update(@Param("num")int num,@Param("customizeId")int customizeId);
}