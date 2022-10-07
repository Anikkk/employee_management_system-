package com.dailycodebuffer.employeesystemapi.services;

import java.util.List;

import com.dailycodebuffer.employeesystemapi.model.Employee;

public interface EmployeeService {
    
    Employee createEmployee(Employee employee);
    
    List<Employee> getAllEmployee();

    boolean deleteEmployee(Long id);

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);

    
}
