package com.demo.learning.thread;

public class Student implements Cloneable {
	
	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
@Override
protected Object clone() throws CloneNotSupportedException {
	return super.clone();
}
	

}
