package com.service.dao;

import com.entity.SkCourse;
import com.entity.SkCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkCourseMapper {
    long countByExample(SkCourseExample example);

    int deleteByExample(SkCourseExample example);

    int insert(SkCourse record);

    int insertSelective(SkCourse record);

    List<SkCourse> selectByExample(SkCourseExample example);

    int updateByExampleSelective(@Param("record") SkCourse record, @Param("example") SkCourseExample example);

    int updateByExample(@Param("record") SkCourse record, @Param("example") SkCourseExample example);
}