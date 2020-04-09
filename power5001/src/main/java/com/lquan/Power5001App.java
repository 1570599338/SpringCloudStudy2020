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
//@RibbonClients({
//        @RibbonClient(name = "SERVER-ORDER",configuration = OrderRuleConfig.class),
//        @RibbonClient(name = "SERVER-POWER",configuration = PowerRuleConfig.class)
//})
//@EnableFeignClients
//@EnableHystrix
public class Power5001App{

    public static void main(String[] args) {

        SpringApplication.run(Power5001App.class);

    }
}
