package com.example.sweater.controller.restcontroller;

import com.example.sweater.ResponseData;
import com.example.sweater.Statics;
import com.example.sweater.domain.User;
import com.example.sweater.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserDbRestController {

    @Autowired
    private UserRepo userDbRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ResponseData login(@RequestParam String username, @RequestParam String password) {
        ResponseData responseData = new ResponseData();
        User user = userDbRepo.findByUsername(username);
        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
            responseData.status = Statics.OK;
            responseData.data = user;
        } else {
            responseData.status = Statics.NOT_FOUND;
            responseData.message = "User not found";
        }

        return responseData;
    }
}
