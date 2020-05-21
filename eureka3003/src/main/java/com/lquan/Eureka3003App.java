package com.lquan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * ClassName com.lquan.Eureka3001App
 *
 * @Author lquan
 * @Description //注册中心
 * @Date
 * @Param
 * @return
 **/

@SpringBootApplication
@EnableEurekaServer
public class Eureka3003App {

    public static void main(String[] args) {

        SpringApplication.run(Eureka3003App.class);

    }
}
