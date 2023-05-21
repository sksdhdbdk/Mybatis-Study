package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User QueryUserById(@Param("id") int id);
}
