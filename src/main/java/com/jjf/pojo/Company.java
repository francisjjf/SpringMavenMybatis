package com.jjf.pojo;

import java.io.Serializable;
import java.util.List;

public class Company implements Serializable{
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<User> getEmployees() {
		return employees;
	}
	public void setEmployees(List<User> employees) {
		this.employees = employees;
	}

	private int id;
	private String name;
	private List<User> employees;
}
