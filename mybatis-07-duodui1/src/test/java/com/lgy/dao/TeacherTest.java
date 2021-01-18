package com.lgy.dao;


import com.lgy.pojo.Teacher;
import com.lgy.utils.mybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TeacherTest {


    @Test
    public void TestTeacher(){

        SqlSession sqlSession = mybatisUtils.getSqlSession();


        TeacherDao mapper = sqlSession.getMapper(TeacherDao.class);

        List<Teacher> teachers = mapper.getTeachers();
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }


        sqlSession.close();
    }

//    测试按照结果嵌套查询
    @Test
    public void Test(){

        SqlSession sqlSession = mybatisUtils.getSqlSession();


        TeacherDao mapper = sqlSession.getMapper(TeacherDao.class);

        Teacher teacher1 = mapper.getTeacher(1);

        System.out.println(teacher1);



        sqlSession.close();
    }

// 按照子查询
@Test
public void Test2(){

    SqlSession sqlSession = mybatisUtils.getSqlSession();


    TeacherDao mapper = sqlSession.getMapper(TeacherDao.class);

    Teacher teacher1 = mapper.getTeacher2(1);

    System.out.println(teacher1);



    sqlSession.close();
}
}
