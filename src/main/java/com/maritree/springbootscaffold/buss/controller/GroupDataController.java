package com.maritree.springbootscaffold.buss.controller;

import com.maritree.springbootscaffold.buss.entity.GroupData;
import com.maritree.springbootscaffold.buss.service.GroupDataService;

import com.maritree.springbootscaffold.common.response.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;


/**
 *
 * 分组数据资源表 RestFul接口
 *
 *
 * @author maritree
 * @since 2018-06-27
 */
@RestController
@RequestMapping("/groupData")
public class GroupDataController {
    Logger logger = LoggerFactory.getLogger(GroupDataController.class);

    @Autowired
    GroupDataService groupDataService;


    @PostMapping("/insert")
    public Object insert(@RequestParam GroupData groupData) {
        groupDataService.insert(groupData);
        return Result.genSuccessResult();
    }

    @GetMapping("/deleteById/{id}")
    public Object delete(@PathVariable Serializable id) {
        groupDataService.deleteById(id);
        return Result.genSuccessResult();

    }
    @PostMapping("/update")
    public Object update(@RequestParam GroupData groupData) {
        groupDataService.updateById(groupData);
        return Result.genSuccessResult();
    }

    @GetMapping("/list")
    public Object list() {
        List<GroupData> groupDataList = groupDataService.selectList(null);
        return Result.genSuccessResult(groupDataList);
    }

}

