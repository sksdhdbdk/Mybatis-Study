package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public void getUserList(){
        //第一步：获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //方式一：执行sql
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();
        //方式二：
/*
        List<User> userList = sqlSession.selectList("com.kuang.dao.UserMapper.getUserList");
*/
        for (User user : userList) {
            System.out.println(user);
        }
        //关闭sqlSession
        sqlSession.close();

    }

}
