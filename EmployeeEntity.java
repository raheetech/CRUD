package com.example.em_project;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@SpringBootApplication
@Data
@Entity
@Table(name = "emp_db4")//table name in mysql
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY ) //id unique over id
    private Long id;

    private String name;
    private String phone;
    private String email;
}
