package com.lgy.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

//编写mybatis的工具类
public class mybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            //获取mybatis的sqlSessionFactory对象
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        }catch (IOException e){
            e.printStackTrace();
        }

    }


    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
