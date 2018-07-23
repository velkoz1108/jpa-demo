package com.example.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/23 16:40
 */
@RestController
public class UserController implements Serializable {
    @Autowired
    private UserRepository userRepository;
    @RequestMapping("/")
    public User getUser(long id){
        User one = userRepository.getOne(id);
        return one;
    }
}
