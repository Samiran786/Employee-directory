package com.thymeleafspringbootapplication.service;

import java.util.List;

import com.thymeleafspringbootapplication.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
}