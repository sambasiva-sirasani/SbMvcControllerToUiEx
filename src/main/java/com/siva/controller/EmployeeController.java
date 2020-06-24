package com.siva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.siva.model.Employee;
import com.siva.service.EmpService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmpService service;
	
	@RequestMapping(value = "/sai")
	public String view(Model model) {
		List<Employee> list=service.getAllEmployees();
		model.addAttribute("list", list);
		System.out.println("done");
		return "EmpData";
		
	}

}
