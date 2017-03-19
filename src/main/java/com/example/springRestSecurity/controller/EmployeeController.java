package com.example.springRestSecurity.controller;

import com.example.springRestSecurity.model.Employee;
import com.example.springRestSecurity.service.EmployeeService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Gaurav Mahajan on 19-03-2017.
 */

@RestController
@RequestMapping(value = "/api/employee")
@Log
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Employee> findAll(){
        log.info("inside findAll() of Controller");
        return employeeService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Employee findOne(@PathVariable long id){
        log.info("inside findOne() of Controller for " + id);
        return employeeService.findOne(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Employee add(@RequestBody Employee employee){
        log.info("inside add() of Controller ");
        return employeeService.addOne(employee);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable long id){
        log.info("inside delete() of Controller for " + id);
        employeeService.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Employee update(@PathVariable long id, @RequestBody Employee employee){
        log.info("Inside updste() of Controller for id "+ id);
        return employeeService.update(id,employee);
    }
}
