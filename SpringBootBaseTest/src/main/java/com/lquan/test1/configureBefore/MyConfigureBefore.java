package com.lquan.test1.configureBefore;/**
 * Created by 01370602 on 2020/5/9.
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName MyConfigureBefore
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
@Configuration
public class MyConfigureBefore {

    public MyConfigureBefore(){
        System.out.println("****************************************BBBB");
        System.out.println();
    }


}
