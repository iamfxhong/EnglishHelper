package com.eh.dao;

import com.eh.entity.User;

public interface UserDao {
	
	User findByEmailAndPassword(User user);

}


