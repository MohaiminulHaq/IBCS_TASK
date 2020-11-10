package com.example.ibcstextDemo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EMPLOYEE_NAME")

public class Employee extends BaseEntity {

    private String name;

    @ManyToOne
    @JoinColumn(name = "GRADE_ID",nullable = false,unique = false)
    private Grade grade;
    private String address;
    private String mobile;
    private String  bankAccount;
    private double basicSalary;



}

