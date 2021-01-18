package com.lgy.dao;


import com.lgy.pojo.Teacher;
import com.lgy.utils.mybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TeacherTest {

    @Test
    public void TestTeacher(){

        SqlSession sqlSession = mybatisUtils.getSqlSession();


        TeacherDao mapper = sqlSession.getMapper(TeacherDao.class);

        Teacher teacher = mapper.getTeacher(1);

        
        sqlSession.close();
    }



}
