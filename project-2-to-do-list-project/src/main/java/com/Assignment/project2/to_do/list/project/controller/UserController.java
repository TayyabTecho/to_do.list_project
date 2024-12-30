package com.Assignment.project2.to_do.list.project.controller;

import com.Assignment.project2.to_do.list.project.model.User;
import com.Assignment.project2.to_do.list.project.request.UserRequest;
import com.Assignment.project2.to_do.list.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public  void createUser(@RequestBody UserRequest userRequest) {
        userService.createUser(userRequest);
    }

    @GetMapping("/findById/{userId}")
    public User findById(@PathVariable Long userId) {
        return userService.findById(userId);
    }

    @PutMapping("/updateById/{userId}")
    public void updateById(@RequestBody UserRequest userRequest, @PathVariable Long userId){
        userService.updateById(userRequest,userId);
    }

    @DeleteMapping("/deleteById/{userId}")
    public String deleteById(@PathVariable Long userId) {
        return userService.deleteById(userId);
    }
}