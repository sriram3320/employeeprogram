package com.employee.dto;


public class EmployeeDto {

    private String employee_name;
	
	private String employee_desigination;
	
	private float employee_salary;

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
