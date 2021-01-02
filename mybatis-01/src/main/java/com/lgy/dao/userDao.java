package com.lgy.dao;

import com.lgy.pojo.User;

import java.util.List;


public interface userDao {


    //获取全部用户
    public List<User> getUserList();

    //根据id查询用户
    public User getUserById( int id);

    //插入一个用户
    public int addUser(User user);

    //修改用户
    public int updateUser (User user);

    //删除用户
    public int deleteUser(int id);


}
