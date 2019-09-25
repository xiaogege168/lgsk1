package com.service.dao;

import com.entity.SkRepository;
import com.entity.SkRepositoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkRepositoryMapper {
    long countByExample(SkRepositoryExample example);

    int deleteByExample(SkRepositoryExample example);

    int insert(SkRepository record);

    int insertSelective(SkRepository record);

    List<SkRepository> selectByExample(SkRepositoryExample example);

    int updateByExampleSelective(@Param("record") SkRepository record, @Param("example") SkRepositoryExample example);

    int updateByExample(@Param("record") SkRepository record, @Param("example") SkRepositoryExample example);
}