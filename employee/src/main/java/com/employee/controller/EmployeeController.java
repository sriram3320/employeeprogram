package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dto.EmployeeDto;
import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

import jakarta.transaction.SystemException;


@RestController
public class EmployeeController {
	@Autowired
	private final EmployeeService employeeService;
	public EmployeeController(final EmployeeService employeeService) {
		this.employeeService = employeeService;
		
	}
	
	@SuppressWarnings({"rawtypes"})
	@PostMapping(value = "/createEmployee")
	public String CreateEmployee(@RequestBody EmployeeDto employeeDto) throws Exception{
		String s = employeeService.CreateEmployee(employeeDto);
		return s;
		}
	
	@GetMapping(value = "/getEmployeeList")
	public Iterable<Employee> GetEmployeeList() throws Exception{
		Iterable<Employee> employeeList = employeeService.GetEmployeeList();
		return employeeList;
		}
	
		@PostMapping(value = "/updateSalary")
		public Long UpdateSalary(@RequestParam(value = "salary", required = false) Long salary) throws Exception {
			Long s = employeeService.UpdateSalary(salary);
			return s;
		}

}
