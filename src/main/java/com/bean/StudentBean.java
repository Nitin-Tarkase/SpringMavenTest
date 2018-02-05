package com.bean;

public class StudentBean {
private String name;
private int id;
public StudentBean(String name, int id) {
	super();
	System.out.println("in sb const");
	this.name = name;
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

}
