package com.service.dao;

import com.entity.SkRecords;
import com.entity.SkRecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkRecordsMapper {
    long countByExample(SkRecordsExample example);

    int deleteByExample(SkRecordsExample example);

    int insert(SkRecords record);

    int insertSelective(SkRecords record);

    List<SkRecords> selectByExample(SkRecordsExample example);

    int updateByExampleSelective(@Param("record") SkRecords record, @Param("example") SkRecordsExample example);

    int updateByExample(@Param("record") SkRecords record, @Param("example") SkRecordsExample example);
}