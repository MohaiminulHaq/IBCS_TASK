package com.example.ibcstextDemo.repository;



import com.example.ibcstextDemo.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,BigInteger> {

    void deleteById(BigInteger id);
}
