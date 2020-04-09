package com.lquan;

import com.lquan.controller.UserRibbbonController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * ClassName RibbionTest
 *
 *
 *
 * @Author lquan
 * @Description // 关于负载均的测试
 * @Date
 * @Param
 * @return
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class RibbionTest{


    @Autowired
    private UserRibbbonController userRibbbonController;



    @Test
    public  void test() {

         userRibbbonController.getUser();
       // System.out.println(""+result);

    }

    @Test
    public  void  testRibbon(){
        userRibbbonController.getOrder();
    }

}
