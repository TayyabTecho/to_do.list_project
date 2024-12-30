package com.Assignment.project2.to_do.list.project.service;

import com.Assignment.project2.to_do.list.project.model.User;
import com.Assignment.project2.to_do.list.project.repository.UserRepository;
import com.Assignment.project2.to_do.list.project.request.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void createUser(UserRequest userRequest) {
        User user=new User();
        user.setEmail(userRequest.getEmail());
        user.setUserName(userRequest.getUserName());
        user.setPassword(userRequest.getPassword());
        userRepository.save(user);
    }

    public User findById(Long userId) {
        return userRepository.findById(userId).orElseThrow(()->new RuntimeException("id not found"));
    }

    public void updateById(UserRequest userRequest, Long userId) {
        User user= userRepository.findById(userId).orElseThrow(()->new RuntimeException("id not found"));

        if(userRequest.getUserName()!=null){
            user.setUserName((userRequest.getUserName()));
        }

        if(userRequest.getEmail()!=null){
            user.setEmail(userRequest.getEmail());
        }

        if(userRequest.getPassword()!=null){
            user.setPassword(userRequest.getPassword());
        }
        userRepository.save(user);
    }

    public String deleteById(Long userId) {
        User user=userRepository.findById(userId).orElseThrow(()->new RuntimeException("id not found"));
        userRepository.delete(user);
        return "deleted successfully";
    }
}
