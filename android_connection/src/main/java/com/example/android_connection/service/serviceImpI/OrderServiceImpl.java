package com.example.android_connection.service.serviceImpI;

import com.example.android_connection.service.OrdersService;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl {
    @Autowired
    OrdersService ordersService;
    public void getOrderDetail(int id)
    {
        ordersService.getOrderDetail(id);
    }
}
