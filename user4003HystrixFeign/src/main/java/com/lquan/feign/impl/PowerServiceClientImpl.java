package com.lquan.feign.impl;

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
public class PowerServiceClientImpl implements IPowerServiceClient{


    @Override
    public String getpower() {
        return "报错了";
    }
}
