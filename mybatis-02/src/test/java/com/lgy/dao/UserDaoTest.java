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


//    测试使用假名是不是成功
    @Test
    public void test2(){

        //获取sqlsession对象
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        //执行SQl
        userDao userDao = sqlSession.getMapper(userDao.class);
        User user = userDao.getUserById(1);

        System.out.println(user.toString());


        //关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void test3(){
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        userDao mapper = sqlSession.getMapper(userDao.class);

        int i = mapper.addUser(new User(7, "lgyss", "123"));
        if (i<0){
            System.out.println("插入失败");

        }else {
            System.out.println("插入成功");
        }


        sqlSession.commit();
        sqlSession.close();

    }

}
