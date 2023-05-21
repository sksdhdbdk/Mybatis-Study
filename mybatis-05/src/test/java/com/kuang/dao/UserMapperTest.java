package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        /*List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
        User userById = mapper.getUserById(1);
        System.out.println(userById);*/
/*
        mapper.addUser(new User(5,"hello","12321"));
*/
        mapper.deleteUser(5);
        sqlSession.close();
    }

}
