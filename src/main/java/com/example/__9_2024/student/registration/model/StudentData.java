package com.example.__9_2024.student.registration.model;

public class StudentData {

	private String name;
	private String age;
	private String id;
	
	public StudentData(String name, String age,String id) {
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
