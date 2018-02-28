package com.example.springdemo;

import com.example.springdemo.entities.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    @Autowired
    UserRepository userRepository;


    public void addUser(String name) {

        User user = new User();
        user.setName(name);
        userRepository.saveAndFlush(user);
        log.info("user :" + user.toString() + "added");
    }


}
