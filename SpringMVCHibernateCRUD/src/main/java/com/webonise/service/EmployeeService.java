package com.webonise.service;

import java.util.List;
import com.webonise.model.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    List<Employee> listEmployees();
    Employee getEmployeeById(int id);
    void removeEmployee(int id);
}
