package com.bs23.assignment.controller;

import com.bs23.assignment.model.Bank;
import com.bs23.assignment.model.Employee;
import com.bs23.assignment.model.Settings;
import com.bs23.assignment.service.EmployeeServiceIF;
import com.bs23.assignment.service.SettingsServiceIF;
import com.bs23.assignment.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by sabbir on 12/12/20.
 */
@Controller
public class SettingsController {

    @Autowired
    EmployeeServiceIF employeeService;

    @Autowired
    SettingsServiceIF settingsService;

    @RequestMapping(value = "/settings", method = RequestMethod.GET)
    public String showSettings(ModelMap model) {
        model.put("setting", settingsService.getSettings());
        return "settings";
    }

    @RequestMapping(value = "/settings", method = RequestMethod.POST)
    public String addOrUpdateSettings(Settings settings, BindingResult result) {

        if (result.hasErrors()) {
            return "settings";
        }

        settingsService.saveSettings(settings);
        return "redirect:/settings";
    }

    @RequestMapping(value = "/transfer", method = RequestMethod.GET)
    public String transfer(ModelMap model) {
        Settings settings = settingsService.getSettings();
        Double companyBalance = settings.getCompanyBankBalance();
        Double lowGradeBasicSalary = settings.getLowGradeSalary();

        List<Employee> employeeList = employeeService.getEmployees();
        if (!Constants.isNullOrEmpty(employeeList)) {
            Double totalPayableSalary = 0.0;
            for (Employee employee : employeeList) {
                Double salary = Constants.calculateSalary(employee, lowGradeBasicSalary);
                totalPayableSalary += salary;
                if (totalPayableSalary <= companyBalance) {
                    Bank bankInfo = employee.getBankInfo();
                    bankInfo.setCurrentBalance(salary);
                } else {
                    return "error";
                }
            }
            employeeService.updateAllEmployee(employeeList);

            companyBalance = companyBalance - totalPayableSalary;
            settings.setCompanyBankBalance(companyBalance);
            settingsService.saveSettings(settings);
        }

        model.put("employees", employeeList);
        return "redirect:/list-employees";
    }
}