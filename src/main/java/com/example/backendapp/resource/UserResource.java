package com.example.backendapp.resource;

import com.example.backendapp.Service.UserService;
import com.example.backendapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserResource {
    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public User getuser(){
        return userService.getuser();

    }
}
