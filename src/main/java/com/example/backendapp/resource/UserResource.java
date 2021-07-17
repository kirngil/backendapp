package com.example.backendapp.resource;

import com.example.backendapp.Service.UserService;
import com.example.backendapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserResource {
    @Autowired
    private UserService userService;

    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);

    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();

    }
    @GetMapping("/find")
    public List<User> getByAddress(
            @RequestParam(name="address")
            String address
    ){
return userService.getByAddress(address);

    }

    @PutMapping
    public User updateUserById(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping
    public void deleteUser(
            @RequestParam(name = "userId") String userid
    ) {
         userService.deleteUser(userid);

    }
}
    /*
    @GetMapping("/user")
    public User getuser(){
        return userService.getuser();

    }


    @GetMapping("/allUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();

    }

    @GetMapping("/user/{userId}")
    public User getUserById(@PathVariable("userId") int userid){
        return userService.getUserByID(userid);
    }

    @PutMapping("/user/{userId}")
    public User updateUserById(@PathVariable("userId") int userid, @RequestBody User user){
        return userService.updateUByID(userid, user);
    }

    @DeleteMapping("/user")
    public User deleteUser(
            @RequestParam(name="userId") int userid
    ){
return userService.deleteUser(userid);

    }


*/



