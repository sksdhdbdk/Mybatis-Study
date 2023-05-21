package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


import java.util.List;
public class UserMapperTest {

    @Test
    public void getUserLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserLike("%李%");
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
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
    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    //增删改需要提交事务
    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.addUser(new User(5, "李五", "123333"));
        if (res>0){
            System.out.println("插入成功");
        }
        //提交事务
        sqlSession.commit();
        sqlSession.close();

    }

   /* @Test
    public void addUser2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userid", 5);
        map.put("username","hello");
        map.put("password","222333");
        mapper.addUser2(map);
        sqlSession.commit();

        sqlSession.close();
    }*/
    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(4, "呵呵", "123123"));
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(5);
        sqlSession.commit();
        sqlSession.close();
    }
}
