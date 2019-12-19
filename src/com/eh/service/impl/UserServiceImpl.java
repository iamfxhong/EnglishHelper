package com.eh.service.impl;

import com.eh.dao.UserDao;
import com.eh.entity.User;
import com.eh.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	
	

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}



	public User login(User user) {
		// TODO Auto-generated method stub
		User eUser = userDao.findByEmailAndPassword(user);
		return eUser;
	}

}


