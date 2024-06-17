package com.example.UserData.controller;

import com.example.UserData.model.User;
import com.example.UserData.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserRestController {

    @Autowired
    public UserService service;

    @PostMapping("/api/user/register")
    public String addUser(@RequestBody User user){

        service.addUser(user);
        return user.getUsername()+" is added to the database";
    }

    @GetMapping("/api/user/fetch/{username}")
    public User getUser(@PathVariable String username){
        User user=service.getUser(username);
        return user;
    }
}
