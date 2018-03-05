package com.example.springdemo;

import com.example.springdemo.entities.User;
import com.sun.org.apache.regexp.internal.RE;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@RestController
@Slf4j
@EnableWebMvc
public class Controller {
    @Autowired
    UserService userService;

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String index(Model model) {

        String message = "Hello Spring Boot + JSP";
        model.addAttribute("message", message);

        return "index";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/add/{name}/{secondName}" , produces = "application/json")
    public String add(@PathVariable(name = "name") String name, @PathVariable(name = "secondName") String secondName) {
        User user = new User();
        user.setName(name);
        user.setSecondName(secondName);
        userService.addUser(user);
        return user.toString();
    }
}
