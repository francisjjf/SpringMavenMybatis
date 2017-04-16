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

	@Override
	public List<User> getAllUsers() {
		return this.userDao.selectAll();
	}

}
