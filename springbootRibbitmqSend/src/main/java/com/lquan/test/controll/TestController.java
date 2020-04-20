package com.lquan.test.controll;/**
 * Created by 01370602 on 2020/4/20.
 */

import com.alibaba.fastjson.JSONObject;
import com.lquan.test.config.TestConfig;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * ClassName TestController
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
@RestController
public class TestController {


    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RequestMapping("/sendtest")
    public String send(){

        rabbitTemplate.convertAndSend(TestConfig.EXCHANGE_A,TestConfig.ROUTINGKEY_A,"hello");

//
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("email", "xx@163.com");
//        jsonObject.put("timestamp", 0);
//        String jsonString = jsonObject.toJSONString();
//        System.out.println("jsonString:" + jsonString);
//        // 设置消息唯一id 保证每次重试消息id唯一
//        Message message = MessageBuilder.withBody(jsonString.getBytes())
//                .setContentType(MessageProperties.CONTENT_TYPE_JSON).setContentEncoding("utf-8")
//                .setMessageId(UUID.randomUUID() + "").build(); //消息id设置在请求头里面 用UUID做全局ID
//        rabbitTemplate.convertAndSend("fanout_email_queue", message);

        return "success";
    }

}
