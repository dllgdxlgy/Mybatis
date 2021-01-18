package com.lgy.dao;

import com.lgy.pojo.Student;
import com.lgy.utils.mybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentTest {

    @Test
    public void Test1(){

        SqlSession sqlSession = mybatisUtils.getSqlSession();


        StudentDao mapper = sqlSession.getMapper(StudentDao.class);

        List<Student> students = mapper.getStudent();
        for (Student student : students) {
            System.out.println(student);
        }

        sqlSession.close();
    }

    @Test
    public void Test2(){

        SqlSession sqlSession = mybatisUtils.getSqlSession();


        StudentDao mapper = sqlSession.getMapper(StudentDao.class);

        List<Student> students = mapper.getStudent2();
        for (Student student : students) {
            System.out.println(student);
        }

        sqlSession.close();
    }
}
