package com.example.android_connection;

import com.example.android_connection.Bean.orderDetail;
import com.example.android_connection.Bean.tours;
import com.example.android_connection.Mapper.OrdersMapper;
import com.example.android_connection.Mapper.ToursMapper;
import com.example.android_connection.Mapper.UsersMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class AndroidConnectionApplicationTests {
    @Autowired
    ToursMapper toursMapper;
    @Autowired
    OrdersMapper ordersMapper;
    @Autowired
    UsersMapper usersMapper;

    @Test
    void contextLoads() {
        System.out.println("yes");
        System.out.println(toursMapper.getAll());
    }
    @Test
    List<tours> ticketstest()
    {
        System.out.println("yes");
        return toursMapper.getAll();
    }
    @Test
    void getorders(){
        List<orderDetail> order =ordersMapper.getOrderDetail(1);
        System.out.println(order);
    }
    @Test
    void buy(){
//        ordersMapper.createOrders(1,usersMapper.getId("lisi"));
        System.out.println(ordersMapper.getOrderDetail(1));
        System.out.println(toursMapper.getAll());
    }


}
