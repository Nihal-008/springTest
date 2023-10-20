package com.vaccination.projectTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.vaccination.projectTest.modelM.User;
import com.vaccination.projectTest.service.service;
import com.vaccination.projectTest.service.serviceIMPL;



@Controller
public class userController {
     @Autowired
     private service srv;
      @GetMapping("/")
      public String indexPages(){
        System.out.println("index page");
           return "index";
      }
       @GetMapping("/signUpUser")
      public String signPage(Model model){    
            model.addAttribute("user", new User());   
            return "signUpUser";
      }
      @PostMapping("/signUpUser")
      public String signUpuserpage(@ModelAttribute User a){
          srv.adduser(a);
      
            return "redirect:/showUsers";
      }
     

@GetMapping("/showUsers")
public String showUsersPage(Model model) {
   
            model.addAttribute("users", srv.getAllUsers());

    return "showUsers";

}
}