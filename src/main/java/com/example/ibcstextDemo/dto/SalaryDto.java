package com.example.ibcstextDemo.dto;

import lombok.*;

import java.math.BigInteger;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter@Getter
public class SalaryDto {

    private BigInteger id;
    private String gradeName;
    private double basicSalary;
}
