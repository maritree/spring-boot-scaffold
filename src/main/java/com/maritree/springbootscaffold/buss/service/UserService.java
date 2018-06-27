package com.maritree.springbootscaffold.buss.service;

import com.maritree.springbootscaffold.buss.entity.User;
import com.maritree.springbootscaffold.buss.mapper.UserMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户表,loginname和departid唯一 服务实现类
 * </p>
 *
 * @author maritree
 * @since 2018-06-27
 */
@Service
public class UserService extends ServiceImpl<UserMapper, User> {

}

