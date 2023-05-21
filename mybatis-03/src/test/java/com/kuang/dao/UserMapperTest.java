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

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(1);
        System.out.println(user);
        //关闭sqlSession
        sqlSession.close();
        /*select * from mybatis.user where id=#{id}*/
        /*字段名与类型名不一致*/
        /*类型处理器*/
        /*select id,name,pwd as password from mybatis.user where id=#{id}*/


    }

}
