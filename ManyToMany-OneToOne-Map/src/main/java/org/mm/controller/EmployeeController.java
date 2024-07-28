package org.mm.controller;

import org.mm.entities.Employee;
import org.mm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class EmployeeController
{
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(value = "/saveEmp")
	public Employee saveEmp(@RequestBody Employee emloyee)
	{
		return employeeService.saveEmp(emloyee);
	}
}
