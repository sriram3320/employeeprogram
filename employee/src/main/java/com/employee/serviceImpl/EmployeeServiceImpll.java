package com.employee.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeDao;
import com.employee.dto.EmployeeDto;
import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

import jakarta.transaction.SystemException;

@Service
public class EmployeeServiceImpll implements EmployeeService{
	@Autowired
	private final EmployeeDao employeeDao;
	
	
	public EmployeeServiceImpll(final EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
		
	}

	@Override
	public String CreateEmployee(EmployeeDto employeeDto) throws SystemException {
		Employee employee = new Employee();
		employee.setEmployee_name(employeeDto.getEmployee_name());
		employee.setEmployee_desigination(employeeDto.getEmployee_desigination());
		employee.setEmployee_salary(employeeDto.getEmployee_salary());

		employeeDao.save(employee);
		return "Employee profile created for " + employeeDto.getEmployee_name();
	}

	public Iterable<Employee> GetEmployeeList() {
		Iterable<Employee> employeeList = new ArrayList<>();
		employeeList = employeeDao.findAll();
		return employeeList;

	}
	
	public 	Long UpdateSalary(Long salary) {
		Iterable<Employee> employeeList = new ArrayList<>();
		employeeList = employeeDao.findAll();
		for(Employee e:employeeList) {
			e.setEmployee_salary(salary);
			employeeDao.save(e);
		}
		return salary;
	}

}
