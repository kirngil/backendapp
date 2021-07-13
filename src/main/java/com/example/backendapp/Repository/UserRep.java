package com.example.backendapp.Repository;

import com.example.backendapp.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRep {


    public User getuser(){
        User user = new User("Kiran", "Canada", 20);
        return user;
    }
}
