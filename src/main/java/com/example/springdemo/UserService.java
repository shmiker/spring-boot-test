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


    public void addUser(User user) {
        userRepository.saveAndFlush(user);
        log.info(user.toString() + " added");
    }


}
