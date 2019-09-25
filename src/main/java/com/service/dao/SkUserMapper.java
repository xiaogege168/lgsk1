package com.service.dao;

import com.entity.SkUser;
import com.entity.SkUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkUserMapper {
    long countByExample(SkUserExample example);

    int deleteByExample(SkUserExample example);

    int insert(SkUser record);

    int insertSelective(SkUser record);

    List<SkUser> selectByExample(SkUserExample example);

    int updateByExampleSelective(@Param("record") SkUser record, @Param("example") SkUserExample example);

    int updateByExample(@Param("record") SkUser record, @Param("example") SkUserExample example);
}