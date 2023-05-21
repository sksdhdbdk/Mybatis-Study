package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserLike(String name);
    List<User> getUserList();
    User getUserById(int id);

    int addUser(User user);
    //万能map
/*    int addUser2(Map<String,Object> map);*/

    void updateUser(User user);

    void deleteUser(int id);
}
