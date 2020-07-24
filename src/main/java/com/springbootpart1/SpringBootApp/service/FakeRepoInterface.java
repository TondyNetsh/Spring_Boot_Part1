package com.springbootpart1.SpringBootApp.service;

import com.springbootpart1.SpringBootApp.model.User;

public interface FakeRepoInterface{
    User insertUser(long id, String name, String surname);
    User findUserById(long id);
    User deleteUser(long id);
}
