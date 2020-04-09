package com.lquan;

import com.lquan.controller.UserRibbbonController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * ClassName FeignTest
 *
 * @Author lquan
 * @Description  测试feign的相关功能
 * @Date
 * @Param
 * @return
 **/

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FeignTest.class)
public class FeignTest{


    @Autowired
    UserRibbbonController userRibbbonController;

    @Test
    public  void test() {
       String result = userRibbbonController.getFeignPower();

        //System.out.println(result);

    }



}
