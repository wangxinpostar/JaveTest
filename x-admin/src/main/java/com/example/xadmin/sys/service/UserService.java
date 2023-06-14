package com.example.xadmin.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.xadmin.sys.entity.User;

import java.util.Map;

/**
 * @author wangx
 * @description 针对表【x_user】的数据库操作Service
 * @createDate 2023-06-14 10:41:30
 */
public interface UserService extends IService<User> {

    Map<String, Object> login(User user);

    Map<String, Object> getUserInfo(String token);

    void logout(String token);
}
