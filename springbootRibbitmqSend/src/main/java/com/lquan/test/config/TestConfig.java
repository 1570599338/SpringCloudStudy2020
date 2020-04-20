package com.lquan.test.config;/**
 * Created by 01370602 on 2020/4/20.
 */

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName TestConfig
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/

//@ComponentScan("com.lquan.test")
@Configuration
public class TestConfig {

    public static final String EXCHANGE_A = "exchange_lquan";

    public static final String QUEUE_A = "queue_lquan";

    public static final String ROUTINGKEY_A = "routingkey.routLquan";


    public static final String EXCHANGE_D = "exchange_death";

    public static final String QUEUE_D = "queue_death";

    public static final String ROUTINGKEY_D = "routingkey.routdeath";

    /**
     * 针对消费者配置
     * 1. 设置交换机类型
     * 2. 将队列绑定到交换机
     FanoutExchange: 将消息分发到所有的绑定队列，无routingkey的概念
     HeadersExchange ：通过添加属性key-value匹配
     DirectExchange:按照routingkey分发到指定队列
     TopicExchange:多关键字匹配
     */
    @Bean
    public DirectExchange defaultExchange() {
        return new DirectExchange(EXCHANGE_A);
    }

    /**
     * 获取队列A
     * @return
     */
    @Bean
    public Queue queueA() {
        //队列持久
        Map<String,Object> map = new HashMap<>();
        //设置消息的过期时间 单位毫秒
        map.put("x-message-ttl",10000);
        //设置附带的死信交换机
        map.put("x-dead-letter-exchange",EXCHANGE_D);
        //指定重定向的路由建 消息作废之后可以决定需不需要更改他的路由建 如果需要 就在这里指定
        map.put("x-dead-letter-routing-key",ROUTINGKEY_D);
        return new Queue(QUEUE_A, true,false,false,map);
    }

    /**
     * 队列绑定交换机
     * @return
     */
    @Bean
    public Binding binding() {
        return BindingBuilder.bind(queueA()).to(defaultExchange()).with(ROUTINGKEY_A);
    }




    /**
     * 创建死信队列交换机
     * @return
     */
    @Bean
    public DirectExchange deathExchange() {
        return new DirectExchange(EXCHANGE_D);
    }

    /**
     * 获取队列A
     * @return
     */
    @Bean
    public Queue queueDeath() {
        //队列持久
        return new Queue(QUEUE_D, true);
    }

    /**
     * 队列绑定交换机
     * @return
     */
    @Bean
    public Binding bindingDeath() {
        return BindingBuilder.bind(queueDeath()).to(deathExchange()).with(ROUTINGKEY_D);
    }


}
