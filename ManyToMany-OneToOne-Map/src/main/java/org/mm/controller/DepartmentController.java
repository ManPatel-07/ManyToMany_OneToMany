package org.mm.controller;

import org.mm.entities.Department;
import org.mm.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class DepartmentController 
{
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping(value = "/saveDepart")
	public Department saveDepartment(@RequestBody Department department)
	{
		return departmentService.save(department);
	}
}
