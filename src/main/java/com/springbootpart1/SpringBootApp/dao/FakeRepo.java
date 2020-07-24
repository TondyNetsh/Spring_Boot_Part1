package com.springbootpart1.SpringBootApp.dao;

import com.springbootpart1.SpringBootApp.service.FakeRepoInterface;
import com.springbootpart1.SpringBootApp.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class FakeRepo implements FakeRepoInterface {

    HashMap<Long, User> user = new HashMap<Long, User>();
    public long database(){

        user.put((long)1,new User(1, "Rotondwa", "Netshimbupfe"));
        user.put((long)2,new User(1, "Nkosinathi", "Sithole"));
        user.put((long)3,new User(1, "Thapelo", "Mabuza"));

        return user.size();
    }

    @Override
    public User insertUser(long id, String name, String surname) { //Adds user into a database
        user.put(id,new User(id,name,surname));
        System.out.println(user.get(id));
        return null;
    }

    @Override
    public User findUserById(long id) {//Finds a user by its Id
        System.out.println(user.get(id));
        return null;
    }

    @Override
    public User deleteUser(long id) { //Deletes a selected user
        System.out.println(user.get(id));
        return null;
    }
}

