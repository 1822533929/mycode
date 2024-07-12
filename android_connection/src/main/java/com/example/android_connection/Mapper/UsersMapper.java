package com.example.android_connection.Mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.apache.ibatis.annotations.Mapper;
@Mapper
@Component("UsersMapper")
public interface UsersMapper {
    //登录
    @Select("SELECT count(*) FROM users WHERE username=#{username} AND password=#{password}")
    int login(String username, String password);
    //注册
    @Insert("insert into users (username,password) values (#{username},#{password})")
    int register(String username,String password);
    //查询用户id
    @Select("SELECT id FROM users WHERE username=#{username}")
    int getId(String username);

}
