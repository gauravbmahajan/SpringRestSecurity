package com.example.springRestSecurity.dao;

import com.example.springRestSecurity.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Gaurav Mahajan on 19-03-2017.
 */

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
