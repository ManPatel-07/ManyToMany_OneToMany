package org.mm.controller;

import org.mm.entities.Department;
import org.mm.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

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
	
	@PutMapping(value = "/{departId}/worker/{empId}")
	public Department assignWorkerToDepartment(@PathVariable Long departId,
												@PathVariable Long empId)
	{
		return departmentService.assignWorkerToDepartment(departId, empId);
	}
}
