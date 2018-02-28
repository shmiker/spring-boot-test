package com.example.springdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class Controller {
    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET, path = "/add")
    public void add() {
        userService.addUser("test");
        log.info("added");
    }
}
