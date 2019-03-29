package com.consumer.controller;

import com.consumer.router.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by 13619 on 2019/3/27.
 */
@RestController
public class ConsumerController {
    @Autowired
    HelloRemote helloRemote;

    /**
     * 演示了服务提供者、消费者、提供者三者相互关系的例子
     * @param name
     * @return
     */
    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name")String name){
        return helloRemote.hello(name);
    }

}
