package com.itmuch.cloud.microservicesimpleconsumermovie.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.itmuch.cloud.microservicesimpleconsumermovie.entity.User;
/**
 * Created by 13619 on 2019/3/18.
 */
@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${user.userServicePath}")
    private String userServicePath;
    @RequestMapping(value = "/movie", method = RequestMethod.GET)
    public User findById(@RequestParam Long id){
        return restTemplate.getForObject("http://localhost:7900/simple?id="+id,User.class);
    }
}
