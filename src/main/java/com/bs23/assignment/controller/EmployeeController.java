package com.bs23.assignment.controller;

import com.bs23.assignment.model.Bank;
import com.bs23.assignment.model.Employee;
import com.bs23.assignment.service.EmployeeServiceIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sabbir on 12/12/20.
 */
@Controller
public class EmployeeController {

    @Autowired
    EmployeeServiceIF employeeService;

    @RequestMapping(value = "/list-employees", method = RequestMethod.GET)
    public String showEmployees(ModelMap model) {
        model.put("employees", employeeService.getEmployees());
        return "employees";
    }

    @RequestMapping(value = "/add-employee", method = RequestMethod.GET)
    public String showAddEmployeePage(ModelMap model) {
        model.addAttribute("employee", new Employee());
        model.addAttribute("grades", employeeService.getGrades());
        return "employee";
    }

    @RequestMapping(value = "/add-employee", method = RequestMethod.POST)
    public String addEmployee(Employee employee, BindingResult result) {

        if (result.hasErrors()) {
            return "employee";
        }

        Bank bank = employee.getBankInfo();
        employeeService.saveBank(bank);

        employee.setBankInfo(bank);
        employeeService.saveEmployee(employee);
        return "redirect:/list-employees";
    }
}
