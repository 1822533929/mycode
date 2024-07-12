package com.example.android_connection.Mapper;

import com.example.android_connection.Bean.orderDetail;
import com.example.android_connection.Bean.orders;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("OrdersMapper")
public interface OrdersMapper {
    //获取用户订单
    @Select("SELECT * FROM orders where id = #{id}")
    orders getOrders(int id);
    //订单创建
    @Insert("insert into orders (tid,id) values (#{tid},#{id})")
    int createOrders(int tid,int id);
    //订单查询
    @Select("SELECT " +
            "o.oid AS oid, " +
            "u.username AS username, " +
            "t.tname, " +
            "o.date, " +
            "t.price " +
            "FROM `orders` o " +
            "JOIN `users` u ON o.id = u.id " +
            "JOIN `tours` t ON o.tid = t.tid " +
            "where u.id =#{id}")
    List<orderDetail> getOrderDetail(int id);


}
