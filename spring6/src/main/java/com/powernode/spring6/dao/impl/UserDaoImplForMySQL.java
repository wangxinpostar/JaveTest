package com.powernode.spring6.dao.impl;

import com.powernode.spring6.dao.UserDao;

import java.io.Serializable;

public class UserDaoImplForMySQL implements UserDao, Serializable {
    @Override
    public String deleteById() {
        System.out.println("MySQl数据库正在删除用户信息");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "abcd";
    }
}
