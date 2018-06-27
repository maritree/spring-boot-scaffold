package com.maritree.springbootscaffold.buss.controller;

import com.maritree.springbootscaffold.buss.entity.GroupResource;
import com.maritree.springbootscaffold.buss.service.GroupResourceService;

import com.maritree.springbootscaffold.common.response.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;


/**
 *
 * 分组资源表 RestFul接口
 *
 *
 * @author maritree
 * @since 2018-06-27
 */
@RestController
@RequestMapping("/groupResource")
public class GroupResourceController {
    Logger logger = LoggerFactory.getLogger(GroupResourceController.class);

    @Autowired
    GroupResourceService groupResourceService;


    @PostMapping("/insert")
    public Object insert(@RequestParam GroupResource groupResource) {
        groupResourceService.insert(groupResource);
        return Result.genSuccessResult();
    }

    @GetMapping("/deleteById/{id}")
    public Object delete(@PathVariable Serializable id) {
        groupResourceService.deleteById(id);
        return Result.genSuccessResult();

    }
    @PostMapping("/update")
    public Object update(@RequestParam GroupResource groupResource) {
        groupResourceService.updateById(groupResource);
        return Result.genSuccessResult();
    }

    @GetMapping("/list")
    public Object list() {
        List<GroupResource> groupResourceList = groupResourceService.selectList(null);
        return Result.genSuccessResult(groupResourceList);
    }

}

