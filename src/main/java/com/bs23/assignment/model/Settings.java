package com.bs23.assignment.model;

import javax.persistence.*;

/**
 * Created by sabbir on 12/12/20.
 */
@Entity
@Table(name = "settings")
public class Settings {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "company_bank_balance")
    private Double companyBankBalance;

    @Column(name = "low_grade_salary")
    private Double lowGradeSalary;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Double getCompanyBankBalance() {
        return companyBankBalance;
    }

    public void setCompanyBankBalance(Double companyBankBalance) {
        this.companyBankBalance = companyBankBalance;
    }

    public Double getLowGradeSalary() {
        return lowGradeSalary;
    }

    public void setLowGradeSalary(Double lowGradeSalary) {
        this.lowGradeSalary = lowGradeSalary;
    }
}
