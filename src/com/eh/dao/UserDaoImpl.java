package com.eh.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.eh.entity.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	public User findByEmailAndPassword(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getEmail()+user.getPassword());
		String hql = "from User where email=? and password=?";
		List UserList = this.getHibernateTemplate().find("from User where password=? and email=?",user.getPassword(),user.getEmail());
		if(UserList.size()>0){
			//System.out.println(((User) UserList.get(0)).getNickname()+"---");
			return (User) UserList.get(0);
		}
		return null;
	}


}


