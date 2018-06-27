package com.maritree.springbootscaffold.buss.service;

import com.maritree.springbootscaffold.buss.entity.Resource;
import com.maritree.springbootscaffold.buss.mapper.ResourceMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统资源表 服务实现类
 * </p>
 *
 * @author maritree
 * @since 2018-06-27
 */
@Service
public class ResourceService extends ServiceImpl<ResourceMapper, Resource> {

}

