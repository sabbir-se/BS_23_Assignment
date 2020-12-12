package com.bs23.assignment.service.impl;

import com.bs23.assignment.model.Bank;
import com.bs23.assignment.model.Employee;
import com.bs23.assignment.model.Grade;
import com.bs23.assignment.repository.BankRepository;
import com.bs23.assignment.repository.EmployeeRepository;
import com.bs23.assignment.repository.GradeRepository;
import com.bs23.assignment.service.EmployeeServiceIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sabbir on 12/12/20.
 */
@Service
public class EmployeeServiceImpl implements EmployeeServiceIF {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    GradeRepository gradeRepository;

    @Autowired
    BankRepository bankRepository;

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public List<Grade> getGrades() {
        return gradeRepository.findAll();
    }

    @Override
    public void saveBank(Bank bank) {
        bankRepository.save(bank);
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void updateAllEmployee(List<Employee> employeeList) {
        employeeRepository.saveAll(employeeList);
    }
}
