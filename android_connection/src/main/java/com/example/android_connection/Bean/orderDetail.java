package com.example.android_connection.Bean;

import lombok.Data;

import java.util.Date;
@Data
public class orderDetail {
    private int oid;
    private String username;
    private String tname;
    private Date date;//购买日期
    private int price;

}
