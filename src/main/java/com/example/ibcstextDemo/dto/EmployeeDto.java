package com.example.ibcstextDemo.dto;

import lombok.*;

import java.math.BigInteger;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter@Getter
public class EmployeeDto {

    private BigInteger id;
    private String name;
    private String gradeName;
    private String address;
    private String mobile;
    private String  bankAccount;
    private double basicSalary;
}
