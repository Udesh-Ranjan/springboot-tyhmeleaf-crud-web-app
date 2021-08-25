package org.webapp.springboot.service;

import org.webapp.springboot.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
}
