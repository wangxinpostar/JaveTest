package com.example.mybatisplus;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class MyBatisPlusApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testGetALL() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }
}
