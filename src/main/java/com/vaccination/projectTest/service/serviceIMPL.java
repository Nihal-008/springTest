package com.vaccination.projectTest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.vaccination.projectTest.modelM.User;
import com.vaccination.projectTest.repostitory.UserRepo;
@Service
public class serviceIMPL implements service {
@Autowired
UserRepo obj;
    @Override
    public void adduser(User user) {
       obj.save(user);
    }
    
}
