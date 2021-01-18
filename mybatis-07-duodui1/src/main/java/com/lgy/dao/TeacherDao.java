package com.lgy.dao;

import com.lgy.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherDao {

//    获取所有老师做测试
    public List<Teacher> getTeachers();


    //获取指定的老师下的所有学生
//    按结果集查询
    Teacher getTeacher(@Param("tid") int id);

//    子查询
    Teacher getTeacher2(@Param("tid") int id);


}
