package com.powernode.controller.service.impl;

import com.powernode.controller.pojo.Student;
import com.powernode.controller.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangx
 * @description 针对表【t_student】的数据库操作Service实现
 * @createDate 2023-06-07 17:29:12
 */
@Controller
public class StudentServiceImpl implements StudentService {
    @RequestMapping("/ajax.action")
    @ResponseBody
    public List<Student> list(int ID) {
        List<Student> list = new ArrayList<>();
        Student stu1 = new Student("张三", 23);
        Student stu2 = new Student("李四", 24);
        Student stu3 = new Student("王五", 25);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        return list;
    }
}




