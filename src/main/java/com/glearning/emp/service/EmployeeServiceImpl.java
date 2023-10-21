package com.glearning.emp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.glearning.emp.dao.EmployeeJpaRepository;
import com.glearning.emp.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private final EmployeeJpaRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeJpaRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = this.employeeRepository.findAll();
		return employees;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return this.employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return this.employeeRepository
						.findById(id)
						.orElseThrow(() -> new IllegalArgumentException("invalid employee id passed"));
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return this.employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployeeById(Long id) {
		this.employeeRepository.deleteById(id);

	}

}
