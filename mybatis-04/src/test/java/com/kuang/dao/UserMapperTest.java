package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;


public class UserMapperTest {

    static Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void getUserByLimit(){
        SqlSession sqlsession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        HashMap<String,Integer> map=new HashMap<String, Integer>();
        map.put("startIndex",0);
        map.put("pageSize",2);
        List<User> userList =mapper.getUserByLimit(map);
        for (User user : userList) {
            System.out.println(user);
        }
        sqlsession.close();
    }
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
    @Test
    public void testLog4j(){
        logger.info("info：进入testLog4j");
        logger.debug("debug：进入testLog4j");
        logger.error("error：进入testLog4j");


    }

}
