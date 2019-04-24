package com.jiuyue.conproperties.controller;

import com.jiuyue.conproperties.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create bySeptember
 * 2019/4/23
 * 22:14
 */
@Controller
public class UserController {
    Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private User user;


    @GetMapping("/conf")
    @ResponseBody
    public String configurationProperties(){
        log.warn("Logger日志启动");
        return user.getNickname()+user.getEmail();
    }
}
