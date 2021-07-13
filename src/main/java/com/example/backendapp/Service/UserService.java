package com.example.backendapp.Service;

import com.example.backendapp.Repository.UserRep;
import com.example.backendapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRep userRep;

    public User getuser(){
       return  userRep.getuser();
    }



}
