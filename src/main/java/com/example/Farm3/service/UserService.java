package com.example.Farm3.service;

import com.example.Farm3.model.Users;

import java.util.List;

public interface UserService {
    boolean saveUser(Users users);

   List<Users> getUsers();
}
