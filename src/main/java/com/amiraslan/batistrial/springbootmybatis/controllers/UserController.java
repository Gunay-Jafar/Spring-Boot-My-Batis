package com.amiraslan.batistrial.springbootmybatis.controllers;

import com.amiraslan.batistrial.springbootmybatis.mappers.UserMapper;
import com.amiraslan.batistrial.springbootmybatis.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/all")
    public List<User> getAll() {
        return userMapper.findAll();
    }

    @GetMapping("/find/{id}")
    public User findById(@PathVariable int id)  {
        return userMapper.findById(id);
    }
}
