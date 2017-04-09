package com.jjf.dao;

import java.util.List;

import com.jjf.pojo.User;

public interface IUserDao {
    int deleteByPrimaryKey(Integer id);

    
    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> selectAll();
}