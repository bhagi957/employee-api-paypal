package com.paypal.bfs.test.employeeserv.impl.service;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paypal.bfs.test.employeeserv.api.model.Employee;
import com.paypal.bfs.test.employeeserv.impl.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	public Employee getEmployee(int EmployeeId) {
		Optional<Employee> optEmp = employeeRepo.findById(Integer.valueOf(EmployeeId));
		if (optEmp.isPresent()) {
			return optEmp.get();
		} else {
			throw new NoSuchElementException("The given employee id is not found.");
		}
	}

	public Employee saveEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}
}
