package com.example.ibcstextDemo.repository;


import com.example.ibcstextDemo.domain.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface GradeRepository extends JpaRepository<Grade,BigInteger> {

    List<Grade> findAllByGradeName(String gradeName);
}
