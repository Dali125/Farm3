package com.example.Farm3.service;

import com.example.Farm3.dao.LeadRepository;
import com.example.Farm3.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService{


    @Autowired
    LeadRepository userRepsitory;


    @Override
    public  boolean saveUser(Users users){
        try {
           Users saveUser = userRepsitory.save(users);

           if(saveUser != null){
               return true;
           }else {
               return  false;
           }

        }
        catch (Exception ex){

        }


        return false;

    }

    @Override
    public List<Users> getUsers() {
        return userRepsitory.findAll();
    }


}
