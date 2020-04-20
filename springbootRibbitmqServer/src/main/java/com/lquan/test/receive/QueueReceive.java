package com.lquan.test.receive;/**
 * Created by 01370602 on 2020/4/20.
 */

import com.lquan.test.config.TestConfig;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


/**
 * ClassName QueueReceive
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
@Component
public class QueueReceive {

    //containerFactory:指定我们刚刚配置的容器
    @RabbitListener(queues = TestConfig.QUEUE_A,containerFactory = "simpleRabbitListenerContainerFactory")
    public void getMessage(Message message, Channel channel) throws Exception{

        System.out.println(new String(message.getBody(),"UTF-8"));
        System.out.println(message.getBody());
        //这里我们调用了一个下单方法 如果下单成功了 那么这条消息就可以确认被消费了
        boolean f =true;
        if (f){

    //传入这条消息的标识， 这个标识由rabbitmq来维护 我们只需要从message中拿出来就可以
    //第二个boolean参数指定是不是批量处理的 什么是批量处理我们待会儿会讲到
            channel.basicAck(message.getMessageProperties().getDeliveryTag(),false);
        }else {
            //当然 如果这个订单处理失败了 我们也需要告诉rabbitmq 告诉他这条消息处理失败了 可以退回
            //            也可以遗弃 要注意的是 无论这条消息成功与否 一定要通知 就算失败了 如果不通知的话 rabbitmq端会显示这条
            //            消息一直处于未确认状态，那么这条消息就会一直堆积在rabbitmq端 除非与rabbitmq断开连接 那么他就会把这条
            //            消息重新发给别人 所以 一定要记得通知！
            //前两个参数 和上面的意义一样， 最后一个参数 就是这条消息是返回到原队列 还是这条消息作废 就是不退回了。
            channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, false);
            //其实 这个API也可以去告诉rabbitmq这条消息失败了 与basicNack不同之处 就是 他不能批量
            // 处理消息结果 只能处理单条消息 其实basicNack作为basicReject的扩展开发出来的
            //channel.basicReject(message.getMessageProperties().getDeliveryTag(),true)
        }
    }



    @RabbitListener(queues = "queue_death",containerFactory = "simpleRabbitListenerContainerFactory")
    public void getMessageQueueDeath(Message message, Channel channel) throws Exception{

        System.out.println("queue_death"+new String(message.getBody(),"UTF-8"));
        System.out.println("queue_death——————————————————————"+message.getBody());
        //这里我们调用了一个下单方法 如果下单成功了 那么这条消息就可以确认被消费了
        boolean f =true;
        if (f){

            //传入这条消息的标识， 这个标识由rabbitmq来维护 我们只需要从message中拿出来就可以
            //第二个boolean参数指定是不是批量处理的 什么是批量处理我们待会儿会讲到
            channel.basicAck(message.getMessageProperties().getDeliveryTag(),false);
        }else {
            //当然 如果这个订单处理失败了 我们也需要告诉rabbitmq 告诉他这条消息处理失败了 可以退回
            //            也可以遗弃 要注意的是 无论这条消息成功与否 一定要通知 就算失败了 如果不通知的话 rabbitmq端会显示这条
            //            消息一直处于未确认状态，那么这条消息就会一直堆积在rabbitmq端 除非与rabbitmq断开连接 那么他就会把这条
            //            消息重新发给别人 所以 一定要记得通知！
            //前两个参数 和上面的意义一样， 最后一个参数 就是这条消息是返回到原队列 还是这条消息作废 就是不退回了。
            channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, false);
            //其实 这个API也可以去告诉rabbitmq这条消息失败了 与basicNack不同之处 就是 他不能批量
            // 处理消息结果 只能处理单条消息 其实basicNack作为basicReject的扩展开发出来的
            //channel.basicReject(message.getMessageProperties().getDeliveryTag(),true)
        }
    }
}
