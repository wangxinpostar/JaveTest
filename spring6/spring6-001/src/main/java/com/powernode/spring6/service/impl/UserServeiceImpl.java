package com.powernode.spring6.service.impl;

import com.powernode.spring6.dao.UserDao;
import com.powernode.spring6.dao.impl.UserDaoImplForMySQL;
import com.powernode.spring6.service.UseService;

public class UserServeiceUmpl implements UseService {
    private UserDao userDao = new UserDaoImplForMySQL();

    @Override
    public void deleteById() {
        userDao.deleteById();
    }
}
