package com.example.ibcstextDemo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "GRADE_NAME")
public class Grade extends BaseEntity{

    private String gradeName;
    private String remarks;

    @Column(name = "IS_ACTIVE",nullable = false)
    private Boolean isActive;
}
