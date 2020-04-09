package com.lquan.feign;

import com.lquan.feign.impl.PowerHystrixFeignServiceClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 */

@FeignClient(value = "CLIENT-POWER",fallback = PowerHystrixFeignServiceClientImpl.class)
public interface IPowerHystrixFeiginServiceClient{

    @RequestMapping(value = "/power.do")
    public String getpower();
}
