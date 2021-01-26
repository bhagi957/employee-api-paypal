package com.paypal.bfs.test.employeeserv.impl.repository;

import com.paypal.bfs.test.employeeserv.api.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
}
