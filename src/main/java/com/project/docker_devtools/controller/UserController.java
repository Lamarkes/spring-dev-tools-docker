package com.project.docker_devtools.controller;


import com.project.docker_devtools.entity.UserEntity;
import com.project.docker_devtools.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping(value = "/users")
    public List<UserEntity> findAll(){

        return repository.findAll();
    }
}
