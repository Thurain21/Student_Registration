package com.example.__9_2024.student.registration.service;

import java.util.ArrayList;

import com.example.__9_2024.student.registration.model.StudentData;

public interface Service {

	public ArrayList<StudentData> insertData(StudentData sd);
	public StudentData readData(StudentData sd);
}
