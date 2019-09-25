package com.service.dao;

import com.entity.SkStuOrder;
import com.entity.SkStuOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkStuOrderMapper {
    long countByExample(SkStuOrderExample example);

    int deleteByExample(SkStuOrderExample example);

    int insert(SkStuOrder record);

    int insertSelective(SkStuOrder record);

    List<SkStuOrder> selectByExample(SkStuOrderExample example);

    int updateByExampleSelective(@Param("record") SkStuOrder record, @Param("example") SkStuOrderExample example);

    int updateByExample(@Param("record") SkStuOrder record, @Param("example") SkStuOrderExample example);
}