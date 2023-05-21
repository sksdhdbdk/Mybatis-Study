package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();
    User getUserById(int id);

    void updateUser(User user);

    void deleteUser(int id);
}
