package com.example.em_project;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController//giving super power
public class EmpController {

  
   @Autowired //dependency injection
   EmployeeService employeeService;
    @GetMapping("employees")
    public List<Employee> getAllEmployees() {
        
        
        return employeeService.readEmployee();
    }

    @GetMapping("employees/{id}")
    public Employee getEmployeesById(@PathVariable Long id) {
        
        
        return employeeService.readEmployees(id);
    }


    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee) {
       return employeeService.createEmployee(employee);
       // employees.add(employee);
        //return "Saved Sucessfully";
    }
    
   @DeleteMapping("employees/{id}") 
   public String deleteEmployee(@PathVariable Long id)
   {
    if(employeeService.deleteEmployee(id))
        return "Delete Successfully";
        else{
        return "Not Found";
        }
   }

   @PutMapping("employees/{id}")
   public String putMethodName(@PathVariable Long id, @RequestBody Employee employee) {
       
       return employeeService.updateEmployee(id, employee);
   }
    
}
