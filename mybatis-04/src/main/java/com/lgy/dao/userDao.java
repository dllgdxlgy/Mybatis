package com.lgy.dao;

import com.lgy.pojo.User;

import java.util.List;
import java.util.Map;


public interface userDao {


    //根据id查询用户
    public User getUserById(int id);


    //分页
    List<User> getUserByLimit(Map<String,Integer> map);



}
