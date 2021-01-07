package com.project.simple.controller;


import com.project.simple.entity.User;
import com.project.simple.model.UserRequest;
import com.project.simple.repository.UserRepo;
import com.project.simple.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "product")
public class SimpleController {
@Autowired
UserRepo repository;

@Autowired
    UserService service;

@Autowired
    UserRepo userRepo;


//  @RequestMapping(value = "/create", method = RequestMethod.POST,
//            produces = "application/json")
//    @ApiOperation(value = "Create product")
//    public User create(@RequestBody UserRequest request) {
//        return service.saveProduct(request);
//    }
    
    @RequestMapping(value = "/register", method = RequestMethod.POST,
            produces = "application/json")
    @ApiOperation(value = "Create product")
    public User register(@RequestBody User request) {
        return userRepo.save(request);
        //return service.saveProduct(request);
    }


}