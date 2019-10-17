package com.webonise.dao;

import java.util.List;
import com.webonise.model.Employee;

public interface EmployeeDAO {
	void addEmployee(Employee employee);
	void updateEmployee(Employee employee);
	List<Employee> listEmployees();
	Employee getEmployeeById(int id);
	void removeEmployee(int id);
}
