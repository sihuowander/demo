package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 *
 */
@RestController
public class HelloController {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private String age;
    @RequestMapping("/hello")
    public String hello(){
        return name+age;
    }
}
