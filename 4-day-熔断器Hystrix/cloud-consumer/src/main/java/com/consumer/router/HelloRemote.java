package com.consumer.router;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 13619 on 2019/3/27.
 * 服务消费者
 * 首先在服务注册器上进行注册
 * 其次注册完成后通过Feign 调用在服务注册器上注册的服务提供者(@FeignClient
 * (name= "spring-cloud-producer")
 * name就是服务提供者spring.application.name的内容application.properties文件中)
 * fallback = HelloRemoteHystrix.class  就是在服务熔断的时候返回fallback类中的内容
 */
@FeignClient(name= "spring-cloud-producer",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}
