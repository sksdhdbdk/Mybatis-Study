package com.kuang.dao;



import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    @Select("select * from user")
    List<User> getUsers();
    //方法存在多个参数，所有参数前必须加@Param注解
    @Select("select * from user where id=#{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into user(id,name,pwd) values (#{id},#{name},#{password})")

    int addUser(User user);

    @Delete("delete from user where id=#{uid}")
    int deleteUser(@Param("uid")int id);



}
