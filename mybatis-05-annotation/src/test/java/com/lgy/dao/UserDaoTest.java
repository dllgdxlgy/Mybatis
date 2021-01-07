package com.lgy.dao;


import com.lgy.pojo.User;
import com.lgy.utils.mybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void Test1(){

        SqlSession sqlSession = mybatisUtils.getSqlSession();

        userDao mapper = sqlSession.getMapper(userDao.class);

        List<User> userList = mapper.getUserList();

        for (User user:userList){

            System.out.println(user);
        }


        sqlSession.close();
    }

    @Test
    public void Test2(){

        SqlSession sqlSession = mybatisUtils.getSqlSession();

        userDao mapper = sqlSession.getMapper(userDao.class);

        User userById = mapper.getUserById(1, null);

        System.out.println(userById.toString());


        sqlSession.close();
    }

    @Test
    public void Test3(){

        SqlSession sqlSession = mybatisUtils.getSqlSession();

        userDao mapper = sqlSession.getMapper(userDao.class);

        int ha = mapper.insertUser(new User(6, "吕光", "123"));

        if (ha>0){
            System.out.println("插入成功");
        }else {
            System.out.println("插入失败");
        }

        //如果不写，就要配置自动提交事务
        //sqlSession.commit();


        sqlSession.close();

    }



}
