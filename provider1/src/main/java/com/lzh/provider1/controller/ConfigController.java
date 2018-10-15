package com.lzh.provider1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("config")
@RefreshScope
public class ConfigController {
    @Value("${config}")
    private String config;

    @RequestMapping("")
    @ResponseBody
    public String test(){
        return config;
    }
}
