package com.example.xadmin.sys.controller;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.xadmin.sys.entity.Menu;
import com.example.xadmin.sys.mapper.MenuMapper;
import com.example.xadmin.sys.service.MenuService;
import org.springframework.stereotype.Service;

/**
 * @author wangx
 * @description 针对表【x_menu】的数据库操作Service实现
 * @createDate 2023-06-14 10:41:30
 */
@Service
public class MenuServiceController extends ServiceImpl<MenuMapper, Menu>
        implements MenuService {

}




