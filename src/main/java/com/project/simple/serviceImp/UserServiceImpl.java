/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.simple.serviceImp;

import com.project.simple.entity.User;
import com.project.simple.model.UserRequest;
import com.project.simple.repository.UserRepo;
import com.project.simple.service.UserService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author maheshvari.keshari
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepo userRepo;
    
    @Override
    public User saveProduct(User request) {
        
        User product = new User();
        
        product.setUsername(request.getUsername());
        product.setPassword(request.getPassword());
        return userRepo.save(product);
        
    }

   
    
}
