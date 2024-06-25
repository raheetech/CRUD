package com.example.em_project;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SpringBootApplication
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Long id;
    private String name;
    private String phone;
    private String email;
 //ENCAPSULATION TO REMOVE PUBLIC PROPERTY use lombok not nead of getter setter

  


}
