package com.linkedin.linkedin.services;

import com.linkedin.linkedin.module.UserModule;
import com.linkedin.linkedin.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    @Autowired
    public UsersRepo usersRepo;
    public List<UserModule> getUsers () {
        return usersRepo.findAll();
    }

    public String createNewUser( UserModule user  ){
        try {
            usersRepo.save(user);
        }catch (Error err){
            return err.getMessage();
        }
        return "New user created.";
    }


    public UserModule getUser(UserModule user){
        return usersRepo.findByUseremail(user.getUseremail());
    }


}
