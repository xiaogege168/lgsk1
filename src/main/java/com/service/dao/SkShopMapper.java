package com.service.dao;

import com.entity.SkShop;
import com.entity.SkShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkShopMapper {
    long countByExample(SkShopExample example);

    int deleteByExample(SkShopExample example);

    int insert(SkShop record);

    int insertSelective(SkShop record);

    List<SkShop> selectByExample(SkShopExample example);

    int updateByExampleSelective(@Param("record") SkShop record, @Param("example") SkShopExample example);

    int updateByExample(@Param("record") SkShop record, @Param("example") SkShopExample example);
}