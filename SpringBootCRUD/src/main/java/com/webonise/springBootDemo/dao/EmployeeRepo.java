package com.webonise.springBootDemo.dao;

import org.springframework.data.repository.CrudRepository;

import com.webonise.springBootDemo.model.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

}
