package com.vaccination.projectTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaccination.projectTest.modelM.User;
import com.vaccination.projectTest.repostitory.UserRepo;
@Service
public class serviceIMPL implements service {
@Autowired
  private UserRepo obj; 
    @Override
    public void adduser(User userDetails) {
       obj.save(userDetails);
    }
    @Override
    public List<User> getAllUsers() {
     return obj.findAll();
    }
   
   
   
   
    
}
