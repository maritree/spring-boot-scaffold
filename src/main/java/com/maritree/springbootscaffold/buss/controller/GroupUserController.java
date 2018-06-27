package com.maritree.springbootscaffold.buss.controller;

import com.maritree.springbootscaffold.buss.entity.GroupUser;
import com.maritree.springbootscaffold.buss.service.GroupUserService;

import com.maritree.springbootscaffold.common.response.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;


/**
 *
 * 分组用户表 RestFul接口
 *
 *
 * @author maritree
 * @since 2018-06-27
 */
@RestController
@RequestMapping("/groupUser")
public class GroupUserController {
    Logger logger = LoggerFactory.getLogger(GroupUserController.class);

    @Autowired
    GroupUserService groupUserService;


    @PostMapping("/insert")
    public Object insert(@RequestParam GroupUser groupUser) {
        groupUserService.insert(groupUser);
        return Result.genSuccessResult();
    }

    @GetMapping("/deleteById/{id}")
    public Object delete(@PathVariable Serializable id) {
        groupUserService.deleteById(id);
        return Result.genSuccessResult();

    }
    @PostMapping("/update")
    public Object update(@RequestParam GroupUser groupUser) {
        groupUserService.updateById(groupUser);
        return Result.genSuccessResult();
    }

    @GetMapping("/list")
    public Object list() {
        List<GroupUser> groupUserList = groupUserService.selectList(null);
        return Result.genSuccessResult(groupUserList);
    }

}

