package com.consumer.consumer.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 13619 on 2019/3/28.
 */
@Component
public class HelloRemoteHystrix implements HelloRemote{
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "你好" +name+", 服务提供者异常(服务端)不能正常访问,此时进行了熔断器已经进行了工作 ";
    }
}
