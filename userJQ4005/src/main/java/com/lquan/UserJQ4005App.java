package com.lquan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ClassName User4000App
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class UserJQ4005App{

    public static void main(String[] args) {

        SpringApplication.run(UserJQ4005App.class);

    }
}
