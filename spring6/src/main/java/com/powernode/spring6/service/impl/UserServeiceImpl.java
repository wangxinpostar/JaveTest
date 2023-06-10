package com.powernode.spring6.service.impl;

import com.powernode.spring6.dao.UserDao;
import com.powernode.spring6.dao.impl.UserDaoImplForMySQL;
import com.powernode.spring6.service.UseService;
import org.springframework.stereotype.Service;

@Service("UserServeiceImpl")
public class UserServeiceImpl implements UseService {
    private UserDao userDao = new UserDaoImplForMySQL();

    @Override
    public void deleteById() {
        userDao.deleteById();
    }
}
