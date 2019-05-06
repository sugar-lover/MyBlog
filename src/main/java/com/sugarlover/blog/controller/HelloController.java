package com.sugarlover.blog.controller;

import com.sugarlover.blog.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    // ex 1
    @Value("${uName}")
    private String name;

    @RequestMapping(value = "ex1", method = RequestMethod.GET)
    public String ex1() {
        return name;
    }
    // ex 2
    @RequestMapping("ex2")
    public Person ex2() {
        Person person = new Person();
        person.setName("testname");
        return person;
    }
    // ex 3
    @Autowired
    private UserProperties userProperties;

    @RequestMapping(value = "ex3", method = RequestMethod.GET)
    public String ex3() {
        return userProperties.getName() + userProperties.getAge();
    }

}
