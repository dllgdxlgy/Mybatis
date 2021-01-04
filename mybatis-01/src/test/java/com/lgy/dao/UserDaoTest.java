package com.lgy.dao;

import com.lgy.pojo.User;
import com.lgy.utils.mybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void test(){

        //获取sqlsession对象
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        //执行SQl
        userDao userDao = sqlSession.getMapper(userDao.class);
        List<User> userList = userDao.getUserList();
        for (User user:userList){
            System.out.println(user);
        }

        //关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void Test2(){
        SqlSession sqlSession = mybatisUtils.getSqlSession();

        userDao userDao = sqlSession.getMapper(userDao.class);

        User userById = userDao.getUserById(1);
        System.out.println(userById.toString());

        sqlSession.close();

    }

    @Test
    public void Test3(){
        SqlSession sqlSession = mybatisUtils.getSqlSession();

        userDao userDao = sqlSession.getMapper(userDao.class);

        User user = new User(4,"lgygy","sasa");
         int i =userDao.addUser(user);
       if (i>0){
           System.out.println("插入成功");
       }else {
           System.out.println("插入失败");
       }


       //提交事务
        sqlSession.commit();


        sqlSession.close();

    }

    @Test
    public void Test4(){

        SqlSession sqlSession = mybatisUtils.getSqlSession();
        userDao userDao = sqlSession.getMapper(userDao.class);
        int  i =userDao.updateUser(new User(2,"niha","gag"));
        System.out.println(i);


        //一定要记得提交事务
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void Test5(){
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        userDao userDao = sqlSession.getMapper(userDao.class);

        int i = userDao.deleteUser(2);

        System.out.println(i);


        //一定要记得提交事务
        sqlSession.commit();

        sqlSession.close();
    }


}
