package com.example.__9_2024.student.registration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.__9_2024.student.registration.model.StudentData;

@Controller
public class StartUpController {

	@RequestMapping(value="/register",method=RequestMethod.GET)
	public ModelAndView Register(@ModelAttribute StudentData sd) {
		ModelAndView obj = new ModelAndView();
		obj.addObject("sd",sd);
		obj.setViewName("studentregister");
		return obj;
	}
}
