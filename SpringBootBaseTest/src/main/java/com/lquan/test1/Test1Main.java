package com.lquan.test1;/**
 * Created by 01370602 on 2020/5/9.
 */

import com.lquan.test1.conf.AppConfig1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * ClassName Test1Main
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
@SpringBootApplication
@ComponentScan("com.lquan.test1.conf")
public class Test1Main {

    public static void main(String[] args) {
        SpringApplication.run(Test1Main.class, args).close();


    }


}
