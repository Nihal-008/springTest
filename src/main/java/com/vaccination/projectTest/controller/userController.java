package com.vaccination.projectTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.vaccination.projectTest.modelM.User;
import com.vaccination.projectTest.service.serviceIMPL;

@Controller
public class userController {
     @Autowired
     serviceIMPL obj;
      @GetMapping("/index")
      public String indexPages(){
        System.out.println("index page");
           return "index";
      }
      @PostMapping("/userAdded")
      public String signUpuserpage(@ModelAttribute User a){
          obj.adduser(a);
      
            return "userAdded";
      }
      @GetMapping("/signUpUser")
      public String signPage(){
            return "signUpUser";
      }
@GetMapping("/userAdded")
public String addUsers(){
      return "userAdded";
}
    
}
