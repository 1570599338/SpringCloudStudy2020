package com.lquan.feign.impl;

import com.lquan.feign.IPowerHystrixFeiginServiceClient;
import com.lquan.feign.IPowerServiceClient;
import org.springframework.stereotype.Component;

/**
 * ClassName PowerServiceClientImpl
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
@Component
public class PowerHystrixFeignServiceClientImpl implements IPowerHystrixFeiginServiceClient{


    @Override
    public String getpower() {

        return "hystrix的降级-IPowerHystrixFeiginServiceClient";
    }
}
