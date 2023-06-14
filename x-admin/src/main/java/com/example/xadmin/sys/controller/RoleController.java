package com.example.xadmin.sys.controller;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.xadmin.sys.entity.Role;
import com.example.xadmin.sys.mapper.RoleMapper;
import com.example.xadmin.sys.service.RoleService;
import org.springframework.stereotype.Service;

/**
 * @author wangx
 * @description 针对表【x_role】的数据库操作Service实现
 * @createDate 2023-06-14 10:41:30
 */
@Service
public class RoleController extends ServiceImpl<RoleMapper, Role>
        implements RoleService {

}




