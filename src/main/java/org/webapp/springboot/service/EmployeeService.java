package org.webapp.springboot.service;

import org.springframework.data.domain.Page;
import org.webapp.springboot.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployeeById(final long id);

    public void deleteEmployeeById(final long id);

    public Page<Employee> findPaginated(int pageNo, int page);
}
