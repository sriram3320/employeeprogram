package com.employee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name="employee_info")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long employee_id;
	
	@Column(name="employee_name")
	private String employee_name;
	
	@Column(name="employee_desigination")
	private String employee_desigination;
	
	@Column(name="employee_salary")
	private float employee_salary;

	public long getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(long employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getEmployee_desigination() {
		return employee_desigination;
	}

	public void setEmployee_desigination(String employee_desigination) {
		this.employee_desigination = employee_desigination;
	}

	public float getEmployee_salary() {
		return employee_salary;
	}

	public void setEmployee_salary(float employee_salary) {
		this.employee_salary = employee_salary;
	}

}
