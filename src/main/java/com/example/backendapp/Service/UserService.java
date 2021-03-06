package com.example.backendapp.Service;

import com.example.backendapp.Repository.UserRep;
import com.example.backendapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRep userRep;

    public User saveUser(User user) {
        return userRep.save(user);
    }

    public List<User> getAllUsers() {
        return userRep.findAll();

    }

    public User updateUser(User user) {
        return userRep.save(user);
    }


    public void deleteUser(String userid) {
        userRep.deleteById(userid);
    }

    public List<User> getByAddress(String address) {
    return userRep.findAllByAddress(address);
    }
}

  /*  public User getuser(){
       return  userRep.getuser();
    }


    public User saveUser(User user) {
        return userRep.saveUser(user);
    }



    public User getUserByID(int userid) {
   return userRep.getuserById(userid);
    }

    public User updateUByID(int userid, User user) {
   return userRep.updateUById(userid, user);
    }

    public User deleteUser(int userid) {
        return userRep.deleteUser(userid);
    }
}
*/

