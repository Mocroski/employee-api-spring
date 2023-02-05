package com.mocroski.Employee.services;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.mocroski.Employee.entity.EmployeeEntity;
import com.mocroski.Employee.model.Employee;
import com.mocroski.Employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public Employee createEmployee(Employee employee) {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		BeanUtils.copyProperties(employee, employeeEntity);
		employeeRepository.save(employeeEntity);
		return employee;
	}

}
