package com.example.em_project;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public interface EmployeeService {
   String createEmployee(Employee employee);
   List<Employee> readEmployee();
   boolean deleteEmployee(Long id);
   String updateEmployee(Long id, Employee employee);
   Employee readEmployees(Long id);
}
