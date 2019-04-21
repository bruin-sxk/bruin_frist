package com.sxk.tyxy.controller;

import org.apache.tomcat.jdbc.pool.PoolProperties;
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
        PoolProperties p = new PoolProperties();
        // 数据库连接url
        p.setUrl("jdbc:mysql://127.206.79.212/susu");
        // 数据库连接驱动
        p.setDriverClassName("com.mysql.jdbc.Driver");
        // 数据库用户名
        p.setUsername("root");
        // 数据库的密码
        p.setPassword("root");
        // 是否注册到JMX中
        p.setJmxEnabled(true);
        // 是否被空闲连接回收期进行检测
        p.setTestWhileIdle(false);
        // 是否在连接池取出连接前进行检查
        p.setTestOnBorrow(true);
        // sql查询   sql必须是一个select语句 返回至少有一行数据
        p.setValidationQuery("SELECT 1");
        // 是否在归还前进行检查
        p.setTestOnReturn(false);
        // 设置验证频率 避免过多的验证
        p.setValidationQueryTimeout(30000);
        // 回收期休眠时间
        p.setTimeBetweenEvictionRunsMillis(30000);
        // 最大活动连接
        p.setMaxActive(100);
        // 设置初始化连接数
        p.setInitialSize(10);
        // 设置最大等待时间
        p.setMaxWait(10000);
        // 设置最小等待时间
        p.setMinIdle(10);
        return "FANG WEN CHENG GONG!";
    }
}
