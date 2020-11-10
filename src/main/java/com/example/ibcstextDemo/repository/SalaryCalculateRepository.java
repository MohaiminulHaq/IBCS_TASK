package com.example.ibcstextDemo.repository;

import com.example.ibcstextDemo.domain.SalaryCalculate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.Optional;

public interface SalaryCalculateRepository extends JpaRepository<SalaryCalculate,BigInteger> {

    Optional<SalaryCalculate> findAllByGradeId(BigInteger gradeName);





}
