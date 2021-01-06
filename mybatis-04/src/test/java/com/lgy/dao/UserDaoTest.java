package com.lgy.dao;

import com.lgy.pojo.User;
import com.lgy.utils.mybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UserDaoTest {


   static Logger logger = Logger.getLogger(UserDaoTest.class);


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

    @Test
    public void testLog4j(){
        logger.info("INFO:进入了Log4j");
        logger.debug("DEBUG");
        logger.error("ERROR");


    }

    @Test
    public void getUserByLimit(){
        SqlSession sqlSession = mybatisUtils.getSqlSession();

        userDao userDao = sqlSession.getMapper(userDao.class);
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("startIndex",0);
        hashMap.put("pageSize",2);
        List<User> userByLimit = userDao.getUserByLimit(hashMap);

        for (User user :userByLimit) {
            System.out.println(user.toString());
        }
        sqlSession.close();
    }

}
