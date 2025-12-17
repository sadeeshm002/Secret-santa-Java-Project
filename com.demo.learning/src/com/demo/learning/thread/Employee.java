package com.demo.learning.thread;

import java.util.Arrays;
import java.util.Objects;

public class Employee {

	private Integer id;
	private String name;
	private Integer age;

	public Employee(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		Object[] thisArray = {age,id,name};
		Object[] thatArray = {other.age,other.id,other.name};
		return Arrays.deepEquals(thisArray, thatArray);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

//	@Override
//	public int compareTo(Employee employee) {
//
//		return this.name.compareTo(employee.name);
//
//	}

}
