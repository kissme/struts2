package com.lxitedu.model.bean;

import java.util.HashSet;
import java.util.Set;

public class Clazz {
	private int ClazzID;
	private String name;
	private Set studentSet;
	
	public Set getStudentSet() {
		return studentSet;
	}

	public void setStudentSet(Set studentSet) {
		this.studentSet = studentSet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClazzID() {
		return ClazzID;
	}
	
	public void setClazzID(int clazzID) {
		ClazzID = clazzID;
	}
	
}
