package com.lquan.controller;


import com.lquan.feign.PowerServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * 想要咨询vip课程相关的同学加一下安其拉老师QQ：3164703201
 * 想要往期视频的同学加一下木兰老师QQ：2746251334
 * author：鲁班学院-商鞅老师
 */
@RestController
public class UserRibbbonController{

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    PowerServiceClient powerServiceClient;

    private static final String  POWER_URL="http://CLIENT-POWER";
    private static final String  ORDER_URL="http://SERVER-ORDER";


    @RequestMapping("/getUser.do")
    public String getUser(){


        return "返回成功";
    }

    @RequestMapping("/feignPower.do")
    public String getFeignPower(){
       String result = powerServiceClient.getpower();
        System.out.println(result);
        return result;
    }


    @RequestMapping("/getPower.do")
    public String getOrder(){
        return restTemplate.getForObject(POWER_URL+"/power.do",String.class);
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
