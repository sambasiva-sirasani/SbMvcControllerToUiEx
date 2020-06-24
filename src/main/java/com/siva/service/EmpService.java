package com.siva.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.siva.model.Employee;

@Component
public class EmpService {
	
	public List<Employee> getAllEmployees() {
		return 	List.of(
				new Employee(101,"siva","Gnt",101.2),
				new Employee(102,"sai","Tel",158.2),
				new Employee(103,"satwhik","Hyd",155.6)
				);
	}

}
