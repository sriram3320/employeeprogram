package com.employee.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.employee.dto.EmployeeDto;
import com.employee.entity.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Long>{
	
		public Iterable<Employee> findAll();
}
