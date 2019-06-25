package com.projectleaf.leaf1.service;

import com.projectleaf.leaf1.entity.User;
import com.projectleaf.leaf1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return this.userRepository.save(user);
    }
}
