package com.lquan.controller;


import com.lquan.feign.IPowerHystrixFeiginServiceClient;
import com.lquan.feign.IPowerServiceClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Timer;


/**
 * 想要咨询vip课程相关的同学加一下安其拉老师QQ：3164703201
 * 想要往期视频的同学加一下木兰老师QQ：2746251334
 * author：鲁班学院-商鞅老师
 */
@RestController
public class UserRibbbonController{



    @Autowired
    private IPowerServiceClient iPowerServiceClient;

    @Autowired
    private IPowerHystrixFeiginServiceClient iPowerHystrixFeiginServiceClient;

    private static final String  POWER_URL="http://CLIENT-POWER";
    private static final String  ORDER_URL="http://SERVER-ORDER";


    @RequestMapping("/getUser.do")
    public String getUser(){


        return "返回成功";
    }


    /**
     * hystrix的降级
     * @return
     * @throws Exception
     */
    @RequestMapping("/feignPower.do")
    @HystrixCommand(fallbackMethod = "getFeignPowerFullBack")
    public String getFeignPower() throws Exception{
        Thread.sleep(4000);
       String result = iPowerServiceClient.getpower();
        System.out.println(result);
        return result;
    }


    /**
     * 利用feign 默认是支持hystrix的
     * @return
     * @throws Exception
     */
    @RequestMapping("/feignPower2.do")
    public String getFeignHystixPower() throws Exception{
        Thread.sleep(4000);
        String result = iPowerHystrixFeiginServiceClient.getpower();
        System.out.println(result);
        return result;
    }



    /**
     * hystrix的降级
     * @return
     * @throws Exception
     */
    @RequestMapping("/feignPowerCount.do")
    @HystrixCommand(fallbackMethod = "getFeignPowerKeepCountFullBack",
            threadPoolKey = "order",
            threadPoolProperties = {@HystrixProperty(name =  "coreSize",value = "2"),
                                    @HystrixProperty(name = "maxQueueSize",value = "1")

            }
    )
    public String getFeignKeepCountPower() throws Exception{
        String result = iPowerServiceClient.getpower();
        System.out.println(result);
        return result;
    }


    public String  getFeignPowerKeepCountFullBack(){
        return "系统正在维护中,请稍后重试getFeignPowerKeepCountFullBack-限流";
    }


    public String  getFeignPowerFullBack(){
        return "系统正在维护中,请稍后重试getFeignPowerFullBack";
    }





/**
    @Autowired
    private  PowerFeignClient powerFeignClient;


    @RequestMapping("/getUser.do")
    public R getUser(){
        Map<String,Object> map = new HashMap<>();
        map.put("key","user");

        return R.success("返回成功",map);
    }

    @RequestMapping("/getOrder.do")
    public R getOrder(){
        return R.success("操作成功",restTemplate.getForObject(ORDER_URL+"/getOrder.do",Object.class));
    }


    @RequestMapping("/getFeignPower.do")
    public R getFeignPower(){

        Object power = powerFeignClient.getPower();

        //  map.put("key","power1");

        //"msg":"power服务暂时不可用","code":"500"}

        powerFeignClient.getPowerList();

        return R.success("操作成功");

    }

    @RequestMapping("/getPower.do")
    @HystrixCommand(threadPoolKey = "power",
            threadPoolProperties ={@HystrixProperty(name = "coreSize",value = "5")
            })
    public R getPower(){
        System.out.println("调用了方法");
        return R.success("操作成功",restTemplate.getForObject(POWER_URL+"/getPower.do",Object.class));
    }


    public R  getFeignPowerFullBack(){
        return R.error("系统正在维护中,请稍后重试");
    }

    **/
}
