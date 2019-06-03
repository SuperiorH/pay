package com.controller;

import com.entity.SysConfig;
import com.mapper.SysConfigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    private SysConfigMapper mapper;

    @RequestMapping("/m1")
    public String m1(){
        return "1";
    }

    @RequestMapping("/m2")
    @ResponseBody
    public String m2(){
        return "2";
    }

    @RequestMapping("/m3/{appKey}")
    @ResponseBody
    public String m3(@PathVariable String appKey){
        SysConfig result = mapper.select(appKey);
        if (result == null) {
            return null;
        }
        return result.toString();
    }

}

