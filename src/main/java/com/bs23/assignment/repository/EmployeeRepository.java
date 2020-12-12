package com.bs23.assignment.repository;

import com.bs23.assignment.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sabbir on 12/12/20.
 */
@Transactional
public interface EmployeeRepository  extends JpaRepository<Employee, Long> {

    @Override
    List<Employee> findAll();
}
