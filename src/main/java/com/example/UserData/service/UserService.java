package com.example.UserData.service;

import com.example.UserData.Exception.InvalidUserDataException;
import com.example.UserData.Exception.UserAlreadyExistsException;
import com.example.UserData.model.User;
import com.example.UserData.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    public UserRepo userRepo;

    @Autowired
    public EncryptDecryptService encryptDecryptService;

    public void addUser(User user) {

        if(userRepo.findByUsername(user.getUsername())!=null){
            throw new UserAlreadyExistsException("Username already exists");
        }else {
            String pass = encryptDecryptService.encryptMessage(user.getPassword());
            user.setPassword(pass);

            userRepo.save(user);
        }
    }

    public User getUser(String username) {
        User user=userRepo.findByUsername(username);
        if(user==null){
            throw new InvalidUserDataException("User does not exists in the database.");
        }else {
            String decryptpass = encryptDecryptService.decryptMessage(user.getPassword());
            user.setPassword(decryptpass);
            return user;
        }
    }


}
