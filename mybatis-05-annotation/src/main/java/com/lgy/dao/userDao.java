package com.lgy.dao;

import com.lgy.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;


public interface userDao {

    //注解就是简化开发的作用

    @Select("select * from user")
    public List<User> getUserList();


    //这里本应该就一个参数id，但是由多个参数的时候一定要使用 @Param 注解，@Param 里面的id对应于sql语句里面的#{id}
    @Select("select *from user where id = #{id}")
    public User getUserById(@Param("id") int id,@Param("String") String name);


    //插入数据
    @Insert("insert into user (id,name,pwd) values (#{id},#{name},#{password})")
    public int insertUser(User user);

}
