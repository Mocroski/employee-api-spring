package com.mocroski.Employee.services;

import java.util.List;

import com.mocroski.Employee.model.Employee;

public interface EmployeeService {

	Employee createEmployee(Employee employee);

	List<Employee> getAllEmployees();

}
