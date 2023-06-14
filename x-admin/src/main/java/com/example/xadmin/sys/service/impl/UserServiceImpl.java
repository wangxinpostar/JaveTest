package com.example.xadmin.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.xadmin.sys.entity.User;
import com.example.xadmin.sys.mapper.UserMapper;
import com.example.xadmin.sys.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author wangx
 * @description 针对表【x_user】的数据库操作Service实现
 * @createDate 2023-06-14 10:41:30
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {

}




