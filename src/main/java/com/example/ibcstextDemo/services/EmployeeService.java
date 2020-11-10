package com.example.ibcstextDemo.services;


import com.example.ibcstextDemo.domain.Employee;
import com.example.ibcstextDemo.domain.Grade;
import com.example.ibcstextDemo.domain.SalaryCalculate;
import com.example.ibcstextDemo.dto.EmployeeDto;

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
        employee.setBasicSalary(employeeDto.getBasicSalary());


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

    public List<SalaryCalculate> getSalaryByGradeId(String gradeId){

        List<Grade> gradeList = gradeRepository.findAllByGradeName(gradeId);

        List<SalaryCalculate> salaryCalculateList = new ArrayList<>();
        for (Grade grade : gradeList){

            Optional<SalaryCalculate> salaryCalculateOptional = salaryCalculateRepository.findAllByGradeId(grade.getId());

            SalaryCalculate salaryCalculate = salaryCalculateOptional.get();
            salaryCalculateList.add(salaryCalculate);
        }


        return salaryCalculateList;

    }

//show
    public List<Employee> showmyemployee() {
        List<Employee> students = new ArrayList<Employee>();
        for (Employee student : employeeRepository.findAll()) {
            students.add(student);
        }
        return students;
    }


//update
    public Employee updateProduct(Employee employee){
        Employee abc=employeeRepository.findById(employee.getId()).orElse(null);

        abc.setName(employee.getName());
        abc.setAddress(employee.getAddress());
        abc.setMobile(employee.getMobile());
        abc.setBankAccount(employee.getBankAccount());



        return employeeRepository.save(abc);
    }


    public Employee editProduct(BigInteger id) {
        Optional<Employee> productOptional = employeeRepository.findById(id);
        System.out.print("product list"+productOptional.get());
        return productOptional.get();


    }

    public void deleteProduct(BigInteger id) {

        employeeRepository.deleteById(id);
    }



}
