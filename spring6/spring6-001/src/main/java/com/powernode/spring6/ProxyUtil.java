package com.powernode.spring6;

import com.powernode.spring6.dao.UserDao;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Proxy;

//JDK动态代理
public class ProxyUtil {
    public static @NotNull UserDao createProxy(UserDao userDao) {
        UserDao userDaoImplForMySQLProxy = (UserDao) Proxy.newProxyInstance(UserDao.class.getClassLoader(), new Class[]{UserDao.class}, (proxy, method, args) -> {
            if (method.getName().equals("deleteById")) {
                long l = System.currentTimeMillis();
                Object rs = method.invoke(userDao, args);
                long l1 = System.currentTimeMillis();
                System.out.println(l1 - l);
                return rs;
            }
            return null;
        });
        return userDaoImplForMySQLProxy;
    }
}
