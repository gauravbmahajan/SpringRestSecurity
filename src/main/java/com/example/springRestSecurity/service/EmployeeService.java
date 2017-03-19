package com.example.springRestSecurity.service;

import com.example.springRestSecurity.model.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Gaurav Mahajan on 19-03-2017.
 */

@Component
public interface EmployeeService {

    List<Employee> findAll();
    Employee findOne(long id);
    Employee addOne(Employee employee);
    void delete(long id);
    Employee update(long id,Employee model);
}
