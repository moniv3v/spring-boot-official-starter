package com.oocl.web.sampleWebApp.controller;

import com.oocl.web.sampleWebApp.object.User;
import com.oocl.web.sampleWebApp.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping(produces = {"application/json"})
    public ResponseEntity<String> addUsers(@RequestBody User user) {
        int targetID = userService.addUser(user);
        URI location = URI.create("/users/"+user.getUserId());
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setLocation(location);
        return ResponseEntity.created(location).build();
    }
}
