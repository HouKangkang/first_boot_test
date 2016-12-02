package com.loop.im.controller;

import com.loop.im.service.SecondService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by admin on 2016/11/30.
 */
@RestController
public class SecondController {
    
    @Resource
    public SecondService secondService;
    
    @RequestMapping("/hello")
    String getHello() {
        return secondService.getName();
    }
    
}
