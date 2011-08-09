package com.lxitedu.model.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;

import com.lxitedu.model.bean.Hobby;
import com.lxitedu.model.bean.Nation;
import com.lxitedu.model.bean.User;
import com.lxitedu.model.util.HabernateUtil;


public class UserDAOHabernateImpl implements UserDAO {
	
//	private Session session = HabernateUtil.getSession();
	
	@Override
	public List<Hobby> queryHobby() {
		// TODO Auto-generated method stub
		Session session = HabernateUtil.getSession();
		Transaction beginTransaction = session.beginTransaction();
		Query createQuery = session.createQuery("From Hobby");
		List<Hobby> list = createQuery.list();
		beginTransaction.commit();
		return list;
	}

	@Override
	public List<Nation> queryNation() {
		// TODO Auto-generated method stub
		Session session = HabernateUtil.getSession();
		Transaction beginTransaction = session.beginTransaction();
		Query createQuery = session.createQuery("From Nation");
		List<Nation> list = createQuery.list();
		beginTransaction.commit();
		return list;
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		Session session = HabernateUtil.getSession();
		Transaction beginTransaction = session.beginTransaction();
		session.save(user);
		beginTransaction.commit();
		return false;
	}

	@Override
	public User queryUser(int userID) {
		// TODO Auto-generated method stub
		System.out.println("UserDAOHabernateImpl.queryUser()"+userID);
		Session session = HabernateUtil.getSession();
		Transaction beginTransaction = session.beginTransaction();
		User user = (User)session.get(User.class,userID);
		beginTransaction.commit();
		return user;
	}

	@Override
	public List<User> queryUser() {
		// TODO Auto-generated method stub
		Session session = HabernateUtil.getSession();
		Transaction beginTransaction = session.beginTransaction();
		Query createQuery = session.createQuery("From User");
		List<User> list = createQuery.list();
		beginTransaction.commit();
		return list;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		Session session = HabernateUtil.getSession();
		Transaction beginTransaction = session.beginTransaction();
		session.update(user);
		beginTransaction.commit();
		return false;
	}

	@Override
	public boolean delUser(User user) {
		// TODO Auto-generated method stub
		Session session = HabernateUtil.getSession();
		Transaction beginTransaction = session.beginTransaction();
		session.delete(user);
		beginTransaction.commit();
		return false;
	}
	public static void main(String[] args) {
		Session session = HabernateUtil.getSession();
		Transaction beginTransaction = session.beginTransaction();
		
//		Query query=session.createQuery(" SELECT userName,userPassword FROM User WHERE userID=:userID");
//		query.setString("userID","1");
		/*List<User> list = query.list();
		for(User user:list){
			System.out.println(user.getUserName());
		}*/
		/*List<Object[]> list = query.list();
		for(Object[] user:list){
			System.out.println(user[1]);
		}*/
		
		
		/*Criteria createCriteria = session.createCriteria(User.class);
		createCriteria.add(Restrictions.eq("userPassword", "fsfsdf"));
		List<User> list = createCriteria.list();
		for(User user:list){
			System.out.println(user.getUserName());
		}*/
		
		/*User user =new User();
		user.setUserName("567");
		Example create = Example.create(user);
		Criteria criteria = session.createCriteria(User.class).add(create);
		List<User> list = criteria.list();
		for(User sr:list){
			System.out.println(sr.getUserPassword());
		}	*/
		
		SQLQuery sqlQuery=session.createSQLQuery("SELECT {user.*} FROM user");
		sqlQuery.addEntity("user",User.class);
		List<User> list = sqlQuery.list();
		for(User obj:list){
			
			System.out.println(obj.getUserName());
		}
	}

}
