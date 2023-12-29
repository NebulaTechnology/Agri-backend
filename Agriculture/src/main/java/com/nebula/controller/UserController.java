package com.nebula.controller;

import com.nebula.entity.User;
import com.nebula.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/loginservice")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/login")
    public ResponseEntity<String> checkUser(@RequestBody User user) {
        User user1 = userService.checkUser(user.getUserName(), user.getPassword());
        return user1!=null ? new ResponseEntity<>("login success", HttpStatus.ACCEPTED):new ResponseEntity<>("login failed", HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/user/save",consumes = {"application/json"})
    public ResponseEntity<String> saveUser(@RequestBody User user) {
        String op=userService.saveUser(user);
        return new ResponseEntity<>(op,HttpStatus.ACCEPTED);
    }
}
