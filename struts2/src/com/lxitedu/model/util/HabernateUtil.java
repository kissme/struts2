package com.lxitedu.model.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HabernateUtil {
	private static Session session;
	private static SessionFactory buildSessionFactory;
	public static SessionFactory getBuildSessionFactory() {
		return buildSessionFactory;
	}
	public static Session getSession(){
		
		Configuration configuration=new Configuration().configure();
		
		buildSessionFactory = configuration.buildSessionFactory();
		
//		session=buildSessionFactory.openSession();
		session=buildSessionFactory.getCurrentSession();
		return session;
	}
}
