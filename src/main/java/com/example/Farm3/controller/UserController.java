package com.example.Farm3.controller;


import com.example.Farm3.model.Users;
import com.example.Farm3.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    UserService userService;

   @PostMapping(path = "/save")
    public ResponseEntity<String> saveUsers(@RequestBody Users users){
        if (userService.saveUser(users)){
            return new ResponseEntity<>("User Saved", HttpStatus.OK);
        }else {
            return  new ResponseEntity<>("Failure",

                    HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @CrossOrigin
    @GetMapping(path = "/getUsers")
    public ResponseEntity<List<Users>> getUsers(){

       return  new ResponseEntity<>(userService.getUsers(), HttpStatus.OK);
    }


}
