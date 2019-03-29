package com.consumer.router;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 13619 on 2019/3/28.
 */
@Component
public class HelloRemoteHystrix implements HelloRemote{
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello" + name + "this message send failed";
    }
}
