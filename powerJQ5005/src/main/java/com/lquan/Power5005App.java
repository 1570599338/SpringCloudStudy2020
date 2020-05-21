package com.lquan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ClassName User4000App
 *
 * @Author lquan
 * @Description //模拟的其他的微服务端
 * @Date
 * @Param
 * @return
 **/


@SpringBootApplication
@EnableEurekaClient
public class Power5005App{

    public static void main(String[] args) {

        SpringApplication.run(Power5005App.class);

    }
}
