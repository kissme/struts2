package com.lxitedu.web;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.CacheMode;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lxitedu.model.bean.Clazz;
import com.lxitedu.model.bean.Stu;
import com.lxitedu.model.bean.Student;
import com.lxitedu.model.util.HabernateUtil;

public class Client {
	public static void main(String[] args) {
		Session session = HabernateUtil.getSession();
		Transaction beginTransaction = session.beginTransaction();
		
		/*List list=new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		TestUser user=new TestUser();
		user.setName("xiangxiang");
		user.setList(list);
		session.saveOrUpdate(user);
		
		Set set=new HashSet();
		set.add("aaa");
		set.add("bbb");
		set.add("aaa");
		user.setSet(set);
		
		Map map=new HashMap();
		map.put("111", "aaaa");
		map.put("222", "bbbb");
		map.put("333", "cccc");
		user.setMap(map);
		
		List bag=new ArrayList();
		bag.add("aaaa");
		bag.add("bbbb");
		bag.add("cccc");
		user.setBag(bag);*/
		
		/*Query query = session.createSQLQuery("From TestUser");
		List<TestUser> list = query.list();
		for (TestUser user:list) {
			System.out.println(user);
			
		}*/
//		TestUser user = (TestUser)session.load(TestUser.class,"2");
//		System.out.println(user.getSet());
		
//		Criteria createCriteria = session.createCriteria(TestUser.class);
//		List<TestUser> list = createCriteria.list();
//		for(TestUser use:list){
//			System.out.println(use.getList());
//			System.out.println(use.getMap());
//			System.out.println(use.getSet());
//			System.out.println(use.getBag());
//		}
		/*for (int i = 0; i < user.getList().size(); i++) {
			System.out.println(user.getList().get(i));
		}*/
		
		
		
		/*Clazz clazz=new Clazz();
		clazz.setName("1003");
		
		Student stu=new Student();
		stu.setName("xiang");
		stu.setSex("man");
		
		Set set=new HashSet();
		set.add(stu);
		
		stu.setClazz(clazz);
		
		clazz.setStudentSet(set);
		
		session.save(clazz);*/
	
//		session.saveOrUpdate(stu);
		
//		Student stu1=(Student)session.load(Student.class, 1);
//		System.out.println(stu1.getClazz().getName());
		
		/*Clazz clazz=new Clazz();
		clazz.setClazzID(2);
		session.delete(clazz);*/
		
//		Clazz clazz = (Clazz)session.load(Clazz.class, 1);
//		System.out.println(clazz);
		
		
		
		
		/*Clazz clazz=new Clazz();
		clazz.setName("1003");
		
		Student student=new Student();
		student.setName("xiang");
		student.setSex("masale");
		student.setClazz(clazz);
		
		session.saveOrUpdate(student);
		session.save(clazz);*/
		
		
//		Clazz clazz=(Clazz)session.load(Clazz.class, 1);
//		System.out.println(clazz.getStudent().getName());
		
//		Student student=(Student)session.load(Student.class, 1);
//		System.out.println(student.getClazz().getName());
		
		/*Criteria createCriteria = session.createCriteria(Clazz.class);
		List<Clazz> list = createCriteria.list();
		for(Clazz c:list)
			System.out.println(c.getStudent().getName());*/
		
		/*Criteria createCriteria = session.createCriteria(Student.class);
		List<Student> list = createCriteria.list();
		for(Student c:list)
			System.out.println(c.getClazz());*/
		
		
		
		
		
		/*Stu stu=new Stu();
		stu.setName("love");
		stu.setSex("woman");
		session.saveOrUpdate(stu);*/
		
		
		Stu stu=(Stu)session.get(Stu.class, 1);
		System.out.println(stu.getName());
		
		session.clear();
		session.setCacheMode(CacheMode.PUT);
//		HabernateUtil.getBuildSessionFactory().evict(Stu.class);
		
		Stu stu1=(Stu)session.get(Stu.class, 1);
		System.out.println(stu1.getName());
		
//		System.out.println(session.);
		
		beginTransaction.commit();
	}
}
