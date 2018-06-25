package com.mark.springbootdemo.controller;

import com.mark.springbootdemo.model.ResultEntity;
import com.mark.springbootdemo.model.Users;
import com.mark.springbootdemo.model.UsersExample;
import com.mark.springbootdemo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping("user")
    public ResultEntity<Users> getUserById(@RequestParam(name = "id", defaultValue = "1") int id){
        Users user =userService.selectByPrimaryKey(id);
        return new ResultEntity<>(user);
    }

    @GetMapping("alluser")
    public ResultEntity<List<Users>> getUserById(){
        List<Users> users =userService.selectByExample(new UsersExample());
        return new ResultEntity<>(null);
    }
}
