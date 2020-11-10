package com.example.ibcstextDemo.dto;

import lombok.*;

import java.math.BigInteger;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter@Getter
public class GradeDto {

    private BigInteger id;
    private String gradeName;
    private String remarks;
    private Boolean isActive;
}
