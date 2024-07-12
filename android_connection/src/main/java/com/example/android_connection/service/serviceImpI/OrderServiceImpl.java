package com.example.android_connection.service.serviceImpI;

import com.example.android_connection.Bean.orderDetail;
import com.example.android_connection.service.OrdersService;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements  OrdersService{
    @Autowired
    OrdersService ordersService;
    public orderDetail getOrderDetail(int id)
    {
        System.out.println("service");
        return ordersService.getOrderDetail(id);
    }
}
