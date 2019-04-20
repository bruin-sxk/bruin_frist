package com.sxk.tyxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author suxingkang
 * 2019年 04月 20日
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/success")
    @ResponseBody
    public String test(){
        return "FANG WEN CHENG GONG!";
    }
}
