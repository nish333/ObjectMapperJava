package com.TeleApps.demo.domain;

public class MyObjects {
	
	private String name;
	private int age;
	private String department;
	private String address;
	
	public MyObjects(String name, int age, String department, String address) {
		super();
		this.name = name;
		this.age = age;
		this.department = department;
		this.address = address;
	}

	public MyObjects() {
		super();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "MyObject [name=" + name + ", age=" + age + ", department=" + department + ", address=" + address + "]";
	}
	
	

}
