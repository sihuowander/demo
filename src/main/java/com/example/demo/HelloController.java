package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 *
 */
@RestController
public class HelloController {
    @Autowired
    private StudentProperties studentProperties;
//    @Value("${content}")
//    private String content;
    @RequestMapping("/hello")
    public String hello(){
        return studentProperties.getName()+studentProperties.getAge();
//        return content;
    }
}
