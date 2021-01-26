package com.paypal.bfs.test.employeeserv.impl.service;

import com.paypal.bfs.test.employeeserv.api.model.Employee;

public interface EmployeeService {

    public Employee getEmployee(int EmployeeId);
    public Employee saveEmployee(Employee employee);
}
