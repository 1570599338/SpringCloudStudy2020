package com.lquan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ClassName User4000App
 *
 * @Author lquan
 * @Description 服务端的ribbon的负载均衡
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
public class User4001RibbonApp{

    public static void main(String[] args) {

        SpringApplication.run(User4001RibbonApp.class);

    }
}
