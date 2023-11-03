package com.nebula.service;

import com.nebula.entity.User;
import com.nebula.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;
    @Override
    public User checkUser(String userName, String password) {
        if(userName != null && password !=null) {
            List<User> users = userRepository.findByUserNameAndPassword(userName, password);
            for(User user: users) {
                if(user.getUserName().equals(userName) && user.getPassword().equals(password)){
                    return user;
                }
            }

        } else {
            throw new RuntimeException("userName and password is empty");
        }
        return new User();
    }

    @Override
    public String saveUser(User user) {
        if(user==null)
            throw new RuntimeException("user is empty");
        userRepository.save(user);
        return "user saved";
    }

}
