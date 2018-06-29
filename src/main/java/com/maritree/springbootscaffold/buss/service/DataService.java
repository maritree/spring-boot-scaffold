package com.maritree.springbootscaffold.buss.service;

import com.maritree.springbootscaffold.buss.entity.Data;
import com.maritree.springbootscaffold.buss.mapper.DataMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author maritree
 * @since 2018-06-29
 */
@Service
public class DataService extends ServiceImpl<DataMapper, Data> {

}

