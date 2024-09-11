package com.example.__9_2024.student.registration.service.serviceimpl;

import java.util.ArrayList;

import com.example.__9_2024.student.registration.model.StudentData;
import com.example.__9_2024.student.registration.service.Service;

@org.springframework.stereotype.Service
public class RegistrationService implements Service{

	private ArrayList<StudentData> datalist = new ArrayList <StudentData>();
	
	@Override
	public ArrayList<StudentData> insertData(StudentData sd) {
		sd.setId(String.valueOf(datalist.size()));
		datalist.add(sd);
		return datalist;
	}

	@Override
	public int DeleteData(String id) {
		StudentData sd = datalist.remove(Integer.parseInt(id));
		return sd.getId().equals(id)?1:0;
	}
	
}
