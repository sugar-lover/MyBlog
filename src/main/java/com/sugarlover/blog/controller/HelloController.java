package com.sugarlover.blog.controller;

import com.sugarlover.blog.entity.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
public class HelloController {
    @RequestMapping("getuser")
    public User getUser() {
        User user = new User();
        user.setName("testname");
        return user;
    }
}
