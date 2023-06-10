package com.powernode.controller.mapper;

import com.powernode.controller.pojo.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author wangx
 * @description 针对表【t_student】的数据库操作Mapper
 * @createDate 2023-06-07 17:29:12
 * @Entity com.powernode.controller.pojo.Student
 */
@Component
public interface StudentMapper {
    List<Student> searchAllByName(@Param("name") String name);
}




