package com.paypal.bfs.test.employeeserv.impl;

import javax.ws.rs.NotFoundException;

import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.paypal.bfs.test.employeeserv.api.EmployeeResource;
import com.paypal.bfs.test.employeeserv.api.model.Employee;
import com.paypal.bfs.test.employeeserv.impl.service.EmployeeServiceImpl;

/**
 * Implementation class for employee resource.
 */
@RestController
public class EmployeeResourceImpl implements EmployeeResource {

	@Autowired
	private EmployeeServiceImpl employeeService;

	@Override
	public ResponseEntity<Employee> employeeGetById(String id) {
		
		// Null & Empty Check.
		if (null != id && !Strings.isBlank(id)) {
			try {
				Employee employee = employeeService.getEmployee(Integer.parseInt(id));
				return new ResponseEntity<>(employee, HttpStatus.OK);
			} catch (DataAccessException ex) {
				throw new NotFoundException("Exception in employeeGetById() :" + ex.getMessage());
			}
		} else {
			throw new NotFoundException("The given Employee id not valid. Please try with Valid Employee id");
		}
	}

	@Override
	public ResponseEntity<Employee> employeeCreate(Employee employee) {
		
		//Null Check
		if (null != employee) {
			try {
				Employee response = employeeService.saveEmployee(employee);
				return new ResponseEntity<>(response, HttpStatus.CREATED);
			} catch (DataAccessException ex) {
				throw new NotFoundException("Exception in employeeGetById() :" + ex.getMessage());
			}
		} else {
			throw new NotFoundException("The given Employee input is not valid. Please try with Valid Employee object");
		}
	}
}
