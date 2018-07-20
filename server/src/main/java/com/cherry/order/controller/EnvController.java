package com.cherry.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Author: cherry
 * Date: Created in 2018/6/29 上午10:16
 */
@RequestMapping("/env")
@RestController
@RefreshScope
public class EnvController {
//    @Value("${env}")
//    private String env;

    @GetMapping("/print")
    public String getEvn(){
        return null;
    }
}
