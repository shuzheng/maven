package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.mapper.UserMapper;
import com.app.model.User;
import com.app.service.IUserService;

@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getBooks(int id) {
		return userMapper.getBooks(id);
	}
	
}
