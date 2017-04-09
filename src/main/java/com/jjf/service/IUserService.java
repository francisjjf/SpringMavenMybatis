package com.jjf.service;

import java.util.List;

import com.jjf.pojo.User;


public interface IUserService {  
    public User getUserById(int userId);
    public void insertUser(User user);
    public List<User> getAllUsers();
}
