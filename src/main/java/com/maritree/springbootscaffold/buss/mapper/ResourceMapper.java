package com.maritree.springbootscaffold.buss.mapper;

import com.maritree.springbootscaffold.buss.entity.Resource;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
/**
 * <p>
 * 系统资源表 Mapper 接口
 * </p>
 *
 * @author maritree
 * @since 2018-06-27
 */
@Mapper
public interface ResourceMapper extends BaseMapper<Resource> {

}
