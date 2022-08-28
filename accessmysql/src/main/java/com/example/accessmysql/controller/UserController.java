package com.example.accessmysql.controller;


import com.example.accessmysql.mapper.UserMapper;
import com.example.accessmysql.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/queryUserList")
    public List<User> queryUserList() {
        List<User> userList = userMapper.queryUserList();
        return userList;
    }

    @GetMapping("queryUserById")
    public User queryUserById(@RequestParam(value = "empNo", defaultValue = "100002") int empNo) {
        User user = userMapper.queryUserById(empNo);
        return user;
    }

    @GetMapping("/updateUser")
    public String updateUser(@RequestParam(value = "empNo") int empNo, @RequestParam(value = "ename") String ename, @RequestParam(value = "job") String job) {
        userMapper.updateUser(new User(empNo, ename, job));
        return "更改成功";
    }

//    @GetMapping("/addUser")
//    public String addUser(){
//        userMapper.addUser(new User(21,"阿毛","123456"));
//        return "添加成功";
//
//    }


//    @GetMapping("/deleteUser")
//    public String deleteUser(){
//        userMapper.deleteUser(1);
//        return "删除成功";
//
//    }
}
