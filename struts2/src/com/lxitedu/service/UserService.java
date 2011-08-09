package com.lxitedu.service;

import java.util.List;

import com.lxitedu.model.bean.Hobby;
import com.lxitedu.model.bean.Nation;
import com.lxitedu.model.bean.User;

public interface UserService {
	List<Hobby> queryHobby();
	List<Nation> queryNation();
	boolean addUser(User user);
	User queryUser(int userID);
	List<User> queryUser();
	boolean updateUser(User user);
	boolean delUser(User user);
}
