package org.mm.service;

import java.util.Optional;

import org.mm.dao.DepartmentRepository;
import org.mm.dao.EmployeeRepository;
import org.mm.entities.Department;
import org.mm.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService 
{
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Department save(Department department)
	{
		return departmentRepository.save(department);
	}
	
	public Department assignWorkerToDepartment(Long departId, Long empId)
	{
		Optional<Department> department = departmentRepository.findById(departId);
		Optional<Employee> employee = employeeRepository.findById(empId);
		
		return department.flatMap(department1 -> 
					employee.map(employee1 -> {
//						department1.getWorkers().add(employee1);
//						return departmentRepository.save(department1);
						
						employee1.setWorkerDepartment(department1);
						employeeRepository.save(employee1);
						
						department1.getWorkers().add(employee1);
						return department1;
					})).orElse(null);
	}
}
