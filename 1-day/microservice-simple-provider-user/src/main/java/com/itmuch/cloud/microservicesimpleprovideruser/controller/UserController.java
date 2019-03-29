package com.itmuch.cloud.microservicesimpleprovideruser.controller;

import com.itmuch.cloud.microservicesimpleprovideruser.dao.UserRepository;
import com.itmuch.cloud.microservicesimpleprovideruser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;


/**
 * Created by 13619 on 2019/3/18.
 */
@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/", produces = "application/json; charset=utf-8")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @RequestMapping(value = "/simple", method = RequestMethod.GET)
    public User findUserById(@RequestParam Long id){
        return userRepository.findById(id).get();
    };
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String findUserById(){
        return "中国";
    };
}
