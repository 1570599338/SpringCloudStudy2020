package com.lquan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * ClassName Zuul6000App
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/

@SpringBootApplication
@EnableZuulProxy
public class Zuul6003App{


    public static void main(String[] args) {
        SpringApplication.run(Zuul6003App.class);
    }


}



