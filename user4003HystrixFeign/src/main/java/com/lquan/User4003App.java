package com.lquan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ClassName com.lquan.User4003App
 *
 * @Author lquan
 * @Description
 *  测试微服务端的hystrix的降级、熔断、限流问题
 *
 * @Date
 * @Param
 * @return
 **/


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
public class User4003App{

    public static void main(String[] args) {

        SpringApplication.run(User4003App.class);

    }



}
