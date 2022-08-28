package com.example.accessmysql.mapper;

import com.example.accessmysql.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> queryUserList();
    User queryUserById(int empNo);
    int addUser(User user);
    int updateUser(User user);
    int delUser(int empNo);
}
