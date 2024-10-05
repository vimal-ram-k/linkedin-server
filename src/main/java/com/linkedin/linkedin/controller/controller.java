package com.linkedin.linkedin.controller;

import com.linkedin.linkedin.module.UserModule;
import com.linkedin.linkedin.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.List;

// Adjust as needed
@RestController
@RequestMapping("/api/v1/")
public class controller {

    @Autowired
    public UserServices userServices;

    @GetMapping("/")
    public static String welcomeMessage(){
        return "Hi Boss!";
    }
    @GetMapping("users")
    public List<UserModule> getAllUsers (){
        return userServices.getUsers();
    }



    @PostMapping("users/add")
    public String createNewUser(@ModelAttribute UserModule userModule){
        System.out.println(userModule);
        return userServices.createNewUser(userModule);
    }


    @PostMapping("users/user")
    public ResponseEntity<?> getUser(@ModelAttribute UserModule user){
        UserModule existsuser =  userServices.getUser(user);
        System.out.println("existsuser" + existsuser);
        if(existsuser != null){
            return new ResponseEntity<>(existsuser, HttpStatus.OK);
        }else{
            return new ResponseEntity<>("User not found" , HttpStatus.NOT_FOUND);
        }
    }
}
