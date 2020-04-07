package com.lquan.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName AppUserConfig
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/

@Configuration
public class AppUserConfig{



    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){

        return  new RestTemplate();
    }

    @Bean
    public IRule iRule(){

        // 轮询
        //return new RoundRobinRule();
        return  new RandomRule();
    }
}
