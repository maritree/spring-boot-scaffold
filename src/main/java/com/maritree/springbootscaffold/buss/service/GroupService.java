package com.maritree.springbootscaffold.buss.service;

import com.maritree.springbootscaffold.buss.entity.Group;
import com.maritree.springbootscaffold.buss.mapper.GroupMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统分组表 服务实现类
 * </p>
 *
 * @author maritree
 * @since 2018-06-27
 */
@Service
public class GroupService extends ServiceImpl<GroupMapper, Group> {

}

