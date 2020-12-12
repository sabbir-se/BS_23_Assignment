package com.bs23.assignment.service;

import com.bs23.assignment.model.Bank;
import com.bs23.assignment.model.Employee;
import com.bs23.assignment.model.Grade;

import java.util.List;

/**
 * Created by sabbir on 12/12/20.
 */
public interface EmployeeServiceIF {

    List<Employee> getEmployees();

    List<Grade> getGrades();

    void saveBank(Bank bank);

    void saveEmployee(Employee employee);

    void updateAllEmployee(List<Employee> employeeList);
}
