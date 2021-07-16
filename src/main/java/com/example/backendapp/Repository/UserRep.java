package com.example.backendapp.Repository;

import com.example.backendapp.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRep {

    List<User> userList = new ArrayList();

    public User getuser() {
        User user = new User("Kiran", "Canada", 20);
        return user;
    }

    public User saveUser(User user) {
        user.setUserId(userList.size() + 1);
        userList.add(user);
        return user;
    }

    public List<User> getAllUsers() {

        return userList;
    }

    public User getuserById(int userid) {
        for (User user : userList) {
            if (user.getUserId() == userid) {
                return user;
            }
        }
        return null;
    }

    public User updateUById(int userid, User user) {
        for (User u : userList) {
if(u.getUserId() == userid){
   u.setName(user.getName());
   u.setAddress(user.getAddress());
   u.setAge(user.getAge());
   return u;
}

        }
        return null;
    }

    public User deleteUser(int userid) {
        User deletedUser = null;
        for( User u:userList){
            if(u.getUserId()==userid){
                deletedUser = u;
                userList.remove(u);
            }
        }
        return deletedUser;
    }
}
