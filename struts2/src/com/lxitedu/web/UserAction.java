package com.lxitedu.web;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.lxitedu.model.bean.Hobby;
import com.lxitedu.model.bean.Nation;
import com.lxitedu.model.bean.User;
import com.lxitedu.service.UserFactory;
import com.lxitedu.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<Object>{
	private static final long serialVersionUID = 1L;
	Map<String,String> hobbyMap=new HashMap<String,String>();
	
	public Map<String, String> getHobbyMap() {
		return hobbyMap;
	}

	public void setHobbyMap(Map<String, String> hobbyMap) {
		this.hobbyMap = hobbyMap;
	}

	public Map<String, String> getNationMap() {
		return nationMap;
	}

	public void setNationMap(Map<String, String> nationMap) {
		this.nationMap = nationMap;
	}
	private User user=new User();
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	Map<String,String> nationMap=new HashMap<String,String>();
	UserService userService=UserFactory.getUserServiceImpl();
	@SuppressWarnings("unchecked")
	public String queryUserInfo(){
		List<Hobby> queryHobby = userService.queryHobby();
		List<Nation> queryNation = userService.queryNation();
		for (int i = 0; i < queryHobby.size(); i++) {
			hobbyMap.put(queryHobby.get(i).getName(), queryHobby.get(i).getName());
		}
		for (int i = 0; i < queryNation.size(); i++) {
			nationMap.put(queryNation.get(i).getName(), queryNation.get(i).getName());
		}
	
//		ServletActionContext.getRequest().setAttribute("ho", hobbyMap);
//		ServletActionContext.getRequest().setAttribute("na", nationMap);
		ServletActionContext.getContext().getSession().put("ho", hobbyMap);
		ServletActionContext.getContext().getSession().put("na", nationMap);
		return "success";
	}
	
	public String addUser(){
		
		userService.addUser(user);
		return "success";
		
		
	}
	List<User> queryUser=new ArrayList<User>();
	public List<User> getQueryUser() {
		return queryUser;
	}

	public void setQueryUser(List<User> queryUser) {
		this.queryUser = queryUser;
	}

	public String queryUser(){
		queryUser = userService.queryUser();
		return "success";
	}
	public String queryUserForUpdate(){
		queryUserInfo();
		String userID=ServletActionContext.getRequest().getParameter("userID");
		User queryUserForUpdate = userService.queryUser(Integer.parseInt(userID));
		user.setUserID(Integer.parseInt(userID));
		user.setUserName(queryUserForUpdate.getUserName());
		user.setUserPassword(queryUserForUpdate.getUserPassword());
		user.setSex(queryUserForUpdate.getSex());
		user.setHobby(queryUserForUpdate.getHobby());
		user.setNation(queryUserForUpdate.getNation());
		user.setBirthday(queryUserForUpdate.getBirthday());
		user.setStr(queryUserForUpdate.getHobby().split(", "));
		return "success";
	}
	public String updateUser(){
		userService.updateUser(user);
		return "success";
	}
	public String delUser(){
		String userID=ServletActionContext.getRequest().getParameter("userID");
		user.setUserID(Integer.parseInt(userID));
		userService.delUser(user);
		
		return "success";
	}
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
	
	/*public void validateAddUser() {
		super.validate();
		if(user.getUserName().equals("")){
			this.addFieldError("userName", "用户名不能这空");
		}
	}*/
	
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("a");
		list.add("c");
		list.add("b");
		Collections.sort(list);
		for(Object s:list){
			System.out.println(s);
		}

	}
}
