package com.lquan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

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
//@RibbonClients({
//        @RibbonClient(name = "SERVER-ORDER",configuration = OrderRuleConfig.class),
//        @RibbonClient(name = "SERVER-POWER",configuration = PowerRuleConfig.class)
//})
//@EnableFeignClients
//@EnableHystrix
public class User4000App{

    public static void main(String[] args) {

        SpringApplication.run(User4000App.class);

    }
}
