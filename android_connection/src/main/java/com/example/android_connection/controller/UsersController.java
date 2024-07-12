package com.example.android_connection.controller;

import com.example.android_connection.Mapper.UsersMapper;
import org.json.JSONObject;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") //一级接口
public class UsersController {

    private JSONObject objectTrue = new JSONObject();
    private JSONObject objectFalse = new JSONObject();

    @Autowired
    UsersMapper usersMapper;

    public UsersController() throws JSONException {
        objectTrue.put("result", true);
        objectFalse.put("result", false);
    }

    @ResponseBody
    @RequestMapping("/login") //二级接口
    public String login(String username, String password){
        if(usersMapper.login(username, password) == 0){
            //不存在符合的用户
            return objectFalse.toString();
        } else {
            return objectTrue.toString();
        }
    }
    @ResponseBody
    @RequestMapping("/register")//二级接口
    public String register(String username,String password){
        if(usersMapper.register(username,password)==0){
            return objectFalse.toString();//注册失败,用户已存在
        }else {
            return objectTrue.toString();
        }

    }
}
