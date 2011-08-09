package com.lxitedu.model.dao;

import java.util.List;

import com.lxitedu.model.bean.Hobby;
import com.lxitedu.model.bean.Nation;
import com.lxitedu.model.bean.User;

public interface UserDAO {
	List<Hobby> queryHobby();
	List<Nation> queryNation();
	boolean addUser(User user);
	User queryUser(int userID);
	List<User> queryUser();
	boolean updateUser(User user);
	boolean delUser(User user);
}
