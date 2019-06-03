package com.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SysConfig implements Serializable{

    private String id;
    private String appKey;
    private String appValue;
    private String description;
    private Date createTime;
    private Date updateTime;
    private Boolean deleted;



}
