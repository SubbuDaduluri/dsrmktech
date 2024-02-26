package com.subbu.dsrmktech.service;

import com.subbu.dsrmktech.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> getALlEmployees();

    Employee createEmployee(Employee employee);

    Optional<Employee> getEmployeeById(Long employeeId);

    Employee updateEmployee(Employee employee);

    void deleteEmployee(Employee employee);
}
