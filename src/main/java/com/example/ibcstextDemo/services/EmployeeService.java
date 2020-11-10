package com.example.ibcstextDemo.services;


import com.example.ibcstextDemo.domain.Employee;
import com.example.ibcstextDemo.domain.Grade;
import com.example.ibcstextDemo.domain.SalaryCalculate;
import com.example.ibcstextDemo.dto.EmployeeDto;
import com.example.ibcstextDemo.dto.SalaryDtoxx;
import com.example.ibcstextDemo.repository.EmployeeRepository;
import com.example.ibcstextDemo.repository.GradeRepository;
import com.example.ibcstextDemo.repository.SalaryCalculateRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final GradeRepository gradeRepository;
    private final SalaryCalculateRepository salaryCalculateRepository;

    public BigInteger createEmployee(EmployeeDto employeeDto) {

        Employee employee = new Employee();

        employee.setName(employeeDto.getName());
        employee.setAddress(employeeDto.getAddress());
        employee.setMobile(employeeDto.getMobile());
        employee.setBankAccount(employeeDto.getBankAccount());

        List<Grade> gradeList = gradeRepository.findAllByGradeName(employeeDto.getGradeName());
        for (Grade grade : gradeList) {
            employee.setGrade(grade);
        }

        employeeRepository.saveAndFlush(employee);

        return employeeDto.getId();
    }


    public List<Grade> showmygrade() {
        List<Grade> students = new ArrayList<Grade>();
        for (Grade student : gradeRepository.findAll()) {
            students.add(student);
        }
        return students;
    }

    public List<SalaryDtoxx> getSalaryByGradeId(String gradeId){

        List<Grade> gradeList = gradeRepository.findAllByGradeName(gradeId);

        List<SalaryDtoxx> salaryCalculateList = new ArrayList<>();
        for (Grade grade : gradeList){

            Optional<SalaryCalculate> salaryCalculateOptional = salaryCalculateRepository.findAllByGradeId(grade.getId());

            SalaryCalculate salaryCalculate = salaryCalculateOptional.get();
            salaryCalculateList.add(new SalaryDtoxx(salaryCalculate.getBasicSalary()));
        }


        return salaryCalculateList;

    }


}
