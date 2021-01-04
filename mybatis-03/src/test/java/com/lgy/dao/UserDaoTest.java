package com.lgy.dao;

import com.lgy.pojo.User;
import com.lgy.utils.mybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {


/*
*  select * from mybatis.user where id = #{id};
* 就等于 select id,name,pwd from mybatis.user where id = #{id}
* 但是这里面数据库和实体类字段不匹配
*
* */

    @Test
    public void Test2(){
        SqlSession sqlSession = mybatisUtils.getSqlSession();

        userDao userDao = sqlSession.getMapper(userDao.class);

        User userById = userDao.getUserById(1);
        System.out.println(userById.toString());

        sqlSession.close();

    }

}
