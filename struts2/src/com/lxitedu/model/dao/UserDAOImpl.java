package com.lxitedu.model.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.lxitedu.model.bean.Hobby;
import com.lxitedu.model.bean.Nation;
import com.lxitedu.model.bean.User;
import com.lxitedu.model.util.IbatisUtil;

public class UserDAOImpl implements UserDAO {

	private SqlMapClient sqlMap = IbatisUtil.getSqlMap();
	@SuppressWarnings("unchecked")
	@Override
	public List<Hobby> queryHobby() {
		List<Hobby> queryForList=null;
		try {
			queryForList = sqlMap.queryForList("queryHobby");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return queryForList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Nation> queryNation() {
		// TODO Auto-generated method stub
		List<Nation> queryForList=null;
		try {
			 queryForList = sqlMap.queryForList("querynation");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return queryForList;
	}

	@Override
	public boolean addUser(User user) {
		try {
			sqlMap.insert("userAdd", user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> queryUser() {
		List<User> queryForList=null;
		try {
			queryForList = sqlMap.queryForList("userquery");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return queryForList;
	}

	@Override
	public boolean updateUser(User user) {
		try {
			sqlMap.update("userUpdate", user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delUser(User user) {
		// TODO Auto-generated method stub
		try {
			sqlMap.delete("userdel", user.getUserID());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public User queryUser(int userID) {
		User queryForObject =null;
		try {
			queryForObject = (User)sqlMap.queryForObject("userqueryID", userID);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return queryForObject;
	}

}
