package com.powernode.controller.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.powernode.controller.pojo.Student;
import com.powernode.controller.service.StudentService;
import com.powernode.controller.mapper.StudentMapper;
import org.springframework.stereotype.Service;

/**
* @author wangx
* @description 针对表【t_student】的数据库操作Service实现
* @createDate 2023-06-07 17:29:12
*/
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student>
    implements StudentService{

}




