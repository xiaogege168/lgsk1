package com.service.dao;

import com.entity.SkStudent;
import com.entity.SkStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkStudentMapper {
    long countByExample(SkStudentExample example);

    int deleteByExample(SkStudentExample example);

    int insert(SkStudent record);

    int insertSelective(SkStudent record);

    List<SkStudent> selectByExample(SkStudentExample example);

    int updateByExampleSelective(@Param("record") SkStudent record, @Param("example") SkStudentExample example);

    int updateByExample(@Param("record") SkStudent record, @Param("example") SkStudentExample example);
}