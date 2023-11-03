package com.nebula.service;

import com.nebula.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserService {

    public User checkUser(String userName, String password);
    public String saveUser(User user);
}
