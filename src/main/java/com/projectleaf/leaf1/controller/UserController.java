package com.projectleaf.leaf1.controller;

import com.projectleaf.leaf1.entity.User;
import com.projectleaf.leaf1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(value = "/signup")
    public ResponseEntity createUser(@Valid @RequestBody User u) {
        userService.createUser(u);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
