package com.springbootpart1.SpringBootApp.service;

public interface UserService {
    String addUser(String name, String surname);
    String removeUser(long Id);
    String getUser(long Id);
}
