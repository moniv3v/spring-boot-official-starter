package com.oocl.web.sampleWebApp.service;


import com.oocl.web.sampleWebApp.object.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> userList = new ArrayList<>();
    public Integer addUser(User user){
        user.setUserId(1);
        userList.add(user);
        return user.getUserId();
    }
}
