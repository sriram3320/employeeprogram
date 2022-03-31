package com.employee.service;

import java.util.List;

import com.employee.dto.EmployeeDto;
import com.employee.entity.Employee;

import jakarta.transaction.SystemException;

public interface EmployeeService {

	String CreateEmployee(EmployeeDto employeeDto) throws SystemException;

	Iterable<Employee> GetEmployeeList();

	Long UpdateSalary(Long salary);
}
