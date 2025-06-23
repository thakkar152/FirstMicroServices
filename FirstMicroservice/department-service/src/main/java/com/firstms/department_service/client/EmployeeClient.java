package com.firstms.department_service.client;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import com.firstms.department_service.model.Employee;

@HttpExchange 
public interface EmployeeClient {

	//we already have Employee pojo here in department. 
	
	@GetExchange("employee/departmentid/{id}")
	public List<Employee> findByDepartmentId(@PathVariable Long id);

}
