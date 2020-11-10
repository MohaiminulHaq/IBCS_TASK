package com.example.ibcstextDemo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SALARY_CALCULATE")
public class SalaryCalculate extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "GRADE_ID",nullable = false,unique = true)
    private Grade grade;


    @Column(name = "BASIC_SALARY",nullable = false)
    private double basicSalary;

}
