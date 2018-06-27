package com.maritree.springbootscaffold.buss.controller;

import com.maritree.springbootscaffold.buss.entity.User;
import com.maritree.springbootscaffold.buss.service.UserService;

import com.maritree.springbootscaffold.common.response.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;


/**
 *
 * 系统用户表,loginname和departid唯一 RestFul接口
 *
 *
 * @author maritree
 * @since 2018-06-27
 */
@RestController
@RequestMapping("/user")
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;


    @PostMapping("/insert")
    public Object insert(@RequestParam User user) {
        userService.insert(user);
        return Result.genSuccessResult();
    }

    @GetMapping("/deleteById/{id}")
    public Object delete(@PathVariable Serializable id) {
        userService.deleteById(id);
        return Result.genSuccessResult();

    }
    @PostMapping("/update")
    public Object update(@RequestParam User user) {
        userService.updateById(user);
        return Result.genSuccessResult();
    }

    @GetMapping("/list")
    public Object list() {
        List<User> userList = userService.selectList(null);
        return Result.genSuccessResult(userList);
    }


}

