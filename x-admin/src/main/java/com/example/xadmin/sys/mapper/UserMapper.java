package com.example.xadmin.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.xadmin.sys.entity.User;

import java.util.List;

/**
 * @author wangx
 * @description 针对表【x_user】的数据库操作Mapper
 * @createDate 2023-06-14 10:41:30
 * @Entity com.example.xadmin.sys.pojo.User
 */
public interface UserMapper extends BaseMapper<User> {
    public List<String> getRoleNameByuserId(Integer userId);
}




