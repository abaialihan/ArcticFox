package com.example.sweater.controller.restcontroller;

import com.example.sweater.domain.User;
import com.example.sweater.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserRestController {

    @Autowired
    private UserRepo userRepo;

    @RequestMapping
    public Iterable<User> getUser()  {
        return userRepo.findAll();
    }

}
