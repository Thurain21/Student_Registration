package com.example.__9_2024.student.registration.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public ModelAndView deleteData(@PathVariable(name="id")String id) {
		int result = sci.DeleteData(id);
		ModelAndView obj = new ModelAndView();
		obj.addObject("result",result);
		obj.setViewName("studentregister");
		return obj;			
	}
}
