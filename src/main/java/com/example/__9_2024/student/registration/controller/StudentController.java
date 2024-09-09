package com.example.__9_2024.student.registration.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.__9_2024.student.registration.model.StudentData;
import com.example.__9_2024.student.registration.service.serviceimpl.RegistrationService;

@Controller
public class StudentController {

	@Autowired
	private RegistrationService sci;
	
	@RequestMapping(value="/ShowData",method=RequestMethod.GET)
	public ModelAndView ShowData(@ModelAttribute StudentData sd) {
		ArrayList<StudentData> datalist = sci.insertData(sd);
		ModelAndView obj = new ModelAndView();
		obj.addObject("list",datalist);
		obj.setViewName("studentregister");
		return obj;
	}
}
