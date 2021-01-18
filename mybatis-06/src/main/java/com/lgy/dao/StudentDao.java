package com.lgy.dao;

import com.lgy.pojo.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentDao {


    public List<Student> getStudent();

    public List<Student> getStudent2();
}
