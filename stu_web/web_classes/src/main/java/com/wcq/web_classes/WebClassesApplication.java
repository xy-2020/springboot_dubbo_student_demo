package com.wcq.web_classes;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.wcq")
@DubboComponentScan("com.wcq.serviceimpl")
@MapperScan("com.wcq.dao")
public class WebClassesApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebClassesApplication.class, args);
    }

}
