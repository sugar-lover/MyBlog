package com.sugarlover.blog.controller;

import com.sugarlover.blog.entity.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: SGL
 * @date: 14:24 2019/1/3
 *
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
public class HelloController {
    @RequestMapping("getuser")
    public User getUser() {
        User user = new User();
        user.setUserName("testname");
        return user;
    }
}
