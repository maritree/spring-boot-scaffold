package com.maritree.springbootscaffold.buss.mapper;

import com.maritree.springbootscaffold.buss.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
/**
 * <p>
 * 系统用户表,loginname和departid唯一 Mapper 接口
 * </p>
 *
 * @author maritree
 * @since 2018-06-27
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
