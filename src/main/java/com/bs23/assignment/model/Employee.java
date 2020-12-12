package com.bs23.assignment.model;

import javax.persistence.*;

/**
 * Created by sabbir on 12/12/20.
 */
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @OneToOne
    @JoinColumn(name = "grade_id")
    private Grade gradeInfo;

    private String address;

    private String mobile;

    @OneToOne
    @JoinColumn(name = "bank_id")
    private Bank bankInfo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGradeInfo() {
        return gradeInfo;
    }

    public void setGradeInfo(Grade gradeInfo) {
        this.gradeInfo = gradeInfo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Bank getBankInfo() {
        return bankInfo;
    }

    public void setBankInfo(Bank bankInfo) {
        this.bankInfo = bankInfo;
    }
}
