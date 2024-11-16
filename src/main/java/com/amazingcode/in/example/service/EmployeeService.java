package com.amazingcode.in.example.service;

import java.util.List;

import com.amazingcode.in.example.entity.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);

	List<Employee> getEmployees();

	Employee getEmployee(Long employeeId);

	Employee updateEmployee(Long employeeId, Employee employee);

	void deleteEmployee(Long employeeId);
}
