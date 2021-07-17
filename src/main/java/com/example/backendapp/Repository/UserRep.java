package com.example.backendapp.Repository;

import com.example.backendapp.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRep extends MongoRepository<User, String> {


    List<User> findAllByAddress(String address);
}
