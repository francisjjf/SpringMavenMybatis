package com.jjf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jjf.dao.IUserDao;
import com.jjf.pojo.User;
import com.jjf.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource
    private IUserDao userDao;  

	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}

	public void insertUser(User user) {
		this.userDao.insert(user);
	}

	public List<User> getAllUsers() {
		return this.userDao.selectAll();
	}

}
