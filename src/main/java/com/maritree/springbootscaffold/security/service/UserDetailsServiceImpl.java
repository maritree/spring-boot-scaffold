package com.maritree.springbootscaffold.security.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.maritree.springbootscaffold.buss.entity.User;
import com.maritree.springbootscaffold.buss.service.UserService;
import com.maritree.springbootscaffold.security.entity.JwtUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by echisan on 2018/6/23
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        EntityWrapper<User> entityWrapper=new EntityWrapper<>();
        entityWrapper.eq("user_name",s);
        User user = userService.selectOne(entityWrapper);
        return new JwtUser(user);
    }

}
