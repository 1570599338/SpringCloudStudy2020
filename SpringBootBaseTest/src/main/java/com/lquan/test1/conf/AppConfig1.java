package com.lquan.test1.conf;/**
 * Created by 01370602 on 2020/5/9.
 */

import com.lquan.test1.configureAfter.MyConfigureAfter;
import com.lquan.test1.configureBefore.MyConfigureBefore;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * ClassName AppConfig1
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
@Configuration

@Import({MyConfigureBefore.class,MyConfigureAfter.class})

@AutoConfigureBefore(MyConfigureBefore.class)
@AutoConfigureAfter(MyConfigureAfter.class)
public class AppConfig1 {

    public  AppConfig1(){
        System.out.println();
        System.out.println("****************************************CCCC");
    }

}
