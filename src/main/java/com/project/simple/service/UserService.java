/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.simple.service;

import com.project.simple.entity.User;
import com.project.simple.model.UserRequest;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author maheshvari.keshari
 */
public interface UserService {
 
    public User saveProduct(User user);
    
    }
