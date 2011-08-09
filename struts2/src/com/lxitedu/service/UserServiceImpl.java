package com.lxitedu.service;

import java.util.List;

import com.lxitedu.model.bean.Hobby;
import com.lxitedu.model.bean.Nation;
import com.lxitedu.model.bean.User;
import com.lxitedu.model.dao.UserDAO;
import com.lxitedu.model.dao.UserDAOHabernateImpl;

public class UserServiceImpl implements UserService {
//	private UserDAO userDAO=new UserDAOImpl();
	private UserDAO userDAO=new UserDAOHabernateImpl();
	@Override
	public List<Hobby> queryHobby() {
		// TODO Auto-generated method stub
		return userDAO.queryHobby();
	}

	@Override
	public List<Nation> queryNation() {
		// TODO Auto-generated method stub
		return userDAO.queryNation();
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.addUser(user);
	}

	@Override
	public User queryUser(int userID) {
		// TODO Auto-generated method stub
		return userDAO.queryUser(userID);
	}

	@Override
	public List<User> queryUser() {
		// TODO Auto-generated method stub
		return userDAO.queryUser();
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.updateUser(user);
	}

	@Override
	public boolean delUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.delUser(user);
	}

}
