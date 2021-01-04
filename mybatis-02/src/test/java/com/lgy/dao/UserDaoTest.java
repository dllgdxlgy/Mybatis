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

}
