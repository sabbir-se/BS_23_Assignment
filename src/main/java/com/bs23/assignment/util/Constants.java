package com.bs23.assignment.util;

import com.bs23.assignment.model.Employee;

import java.util.List;

/**
 * Created by sabbir on 12/12/20.
 */
public class Constants {

    public static Integer GRADE_ONE_ID = 1;
    public static Integer GRADE_TWO_ID = 2;
    public static Integer GRADE_THREE_ID = 3;
    public static Integer GRADE_FOUR_ID = 4;
    public static Integer GRADE_FIVE_ID = 5;
    public static Integer GRADE_SIX_ID = 6;

    public static Integer SALARY_INCREASE = 5000;

    public static Boolean isNullOrEmpty(List list) {
        return !(list != null && !list.isEmpty());
    }

    public static Double calculateSalary(Employee employee, Double lowGradeBasicSalary) {
        Double basicSalary = 0.0;
        if (employee.getGradeInfo().getId() == GRADE_ONE_ID) {
            basicSalary = lowGradeBasicSalary + (5 * SALARY_INCREASE);
        } else if (employee.getGradeInfo().getId() == GRADE_TWO_ID) {
            basicSalary = lowGradeBasicSalary + (4 * SALARY_INCREASE);
        } else if (employee.getGradeInfo().getId() == GRADE_THREE_ID) {
            basicSalary = lowGradeBasicSalary + (3 * SALARY_INCREASE);
        } else if (employee.getGradeInfo().getId() == GRADE_FOUR_ID) {
            basicSalary = lowGradeBasicSalary + (2 * SALARY_INCREASE);
        } else if (employee.getGradeInfo().getId() == GRADE_FIVE_ID) {
            basicSalary = lowGradeBasicSalary + (1 * SALARY_INCREASE);
        } else if (employee.getGradeInfo().getId() == GRADE_SIX_ID) {
            basicSalary = lowGradeBasicSalary;
        }

        Double houseRent = (basicSalary * 20) / 100;
        Double medicalAllowance = (basicSalary * 15) / 100;

        return basicSalary + houseRent + medicalAllowance;
    }
}
