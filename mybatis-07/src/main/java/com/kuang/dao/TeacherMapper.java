package com.kuang.dao;

import com.kuang.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {

    public List<Teacher> getTeacher();
    //获取指定老师下的所有老师和学生信息
    Teacher getTeacher(@Param("tid") int id);

}
