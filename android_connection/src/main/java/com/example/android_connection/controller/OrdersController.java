package com.example.android_connection.controller;

import com.example.android_connection.Bean.orderDetail;
import com.example.android_connection.Mapper.OrdersMapper;
import com.example.android_connection.Mapper.UsersMapper;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api") //一级接口
public class OrdersController {
    private JSONObject objectTrue = new JSONObject();
    private JSONObject objectFalse = new JSONObject();
    @Autowired
    OrdersMapper ordersMapper;
    @Autowired
    UsersMapper usersMapper;
    @ResponseBody
    @RequestMapping("/buy")
    public String buy(String username,int tid){
        JSONObject object = new JSONObject();
        object.put("result", true);
        int id =usersMapper.getId(username);
        ordersMapper.createOrders(tid,id);

        return object.toString();
    }
    @ResponseBody
    @RequestMapping("/showorder")
    public String showorder(String username){
        JSONObject object = new JSONObject();
        object.put("result", true);
        object.put("data", ordersMapper.getOrderDetail(usersMapper.getId(username)));
        return object.toString();
    }

}
