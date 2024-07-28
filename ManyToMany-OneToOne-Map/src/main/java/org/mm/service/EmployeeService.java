package org.mm.service;

import org.mm.dao.EmployeeRepository;
import org.mm.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveEmp(Employee employee)
	{
		return employeeRepository.save(employee);
	}
}
