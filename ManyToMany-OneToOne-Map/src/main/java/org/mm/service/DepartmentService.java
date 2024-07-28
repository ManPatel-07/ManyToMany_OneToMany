package org.mm.service;

import org.mm.dao.DepartmentRepository;
import org.mm.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService 
{
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department save(Department department)
	{
		return departmentRepository.save(department);
	}
}
