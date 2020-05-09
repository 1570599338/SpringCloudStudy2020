package com.lquan.test1.configureAfter;/**
 * Created by 01370602 on 2020/5/9.
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName MyConfigureAfter
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
@Configuration
public class MyConfigureAfter {
    public MyConfigureAfter(){
        System.out.println("********************************************************AAAA");
    }

}
