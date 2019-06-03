package com.mapper;

import com.entity.SysConfig;
import org.apache.ibatis.annotations.Param;

public interface SysConfigMapper {
    SysConfig select(@Param("appKey") String appKey);
}
