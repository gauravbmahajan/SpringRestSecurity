package com.example.springRestSecurity.service;

import com.example.springRestSecurity.dao.EmployeeRepository;
import com.example.springRestSecurity.model.Employee;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Gaurav Mahajan on 19-03-2017.
 */
@Log
@Component
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        log.info("inside findAll() of Service");
        return employeeRepository.findAll();
    }

    @Override
    public Employee findOne(long id) {
        log.info("inside findOne() of Service for " + id);
        return employeeRepository.findOne(id);
    }

    @Override
    public Employee addOne(Employee employee) {
        log.info("inside addOne() of Service");
        return employeeRepository.save(employee);
    }

    @Override
    public void delete(long id) {
        log.info("inside delete() of Service for "+ id);
        employeeRepository.delete(id);
    }

    @Override
    public Employee update(long id,Employee model) {
        log.info("inside update() of Service for " + id);
        Employee employee = employeeRepository.findOne(id);
        employee.setFirstName(model.getFirstName());
        employee.setLastName(model.getLastName());
        employee.setDepartment(model.getDepartment());
        return employeeRepository.saveAndFlush(employee);
    }
}
