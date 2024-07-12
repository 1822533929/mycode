package com.example.android_connection.service;

public interface UsersService {
    int login(String username, String password);
    int register(String username,String password);
    int getId(String username);
}
