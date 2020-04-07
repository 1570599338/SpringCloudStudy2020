package com.lquan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * ClassName com.lquan.Eureka3001App
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/

@SpringBootApplication
@EnableEurekaServer
public class Eureka3000App{

    public static void main(String[] args) {

        SpringApplication.run(Eureka3000App.class);

    }
}
