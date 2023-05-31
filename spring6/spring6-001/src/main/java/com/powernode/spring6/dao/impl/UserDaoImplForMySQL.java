package com.powernode.spring6.dao.impl;

import com.powernode.spring6.dao.UserDao;

import java.io.Serializable;

public class UserDaoImplForMySQL implements UserDao, Serializable {
    @Override
    public void deleteById() {
        System.out.println("MySQl数据库正在删除用户信息");
    }
}
