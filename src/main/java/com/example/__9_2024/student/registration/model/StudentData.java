package com.example.__9_2024.student.registration.model;

public class StudentData {

	private String name;
	private String age;
	
	public StudentData(String name, String age) {
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
	
}
