package com.lquan.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 */

@FeignClient("CLIENT-POWER")
public interface IPowerServiceClient{

    @RequestMapping(value = "/power.do")
    public String getpower();
}
