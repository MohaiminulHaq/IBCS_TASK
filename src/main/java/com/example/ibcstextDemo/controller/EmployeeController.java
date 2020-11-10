package com.example.ibcstextDemo.controller;

import com.example.ibcstextDemo.dto.EmployeeDto;
import com.example.ibcstextDemo.dto.GradeDto;
import com.example.ibcstextDemo.dto.SalaryDtoxx;
import com.example.ibcstextDemo.services.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Slf4j
@AllArgsConstructor
@Controller
public class EmployeeController {

    public final EmployeeService employeeService;

    @GetMapping("/employee")
    public String employeeGrade(@ModelAttribute GradeDto gradeDto, HttpServletRequest request) {


        request.setAttribute("gradeList", employeeService.showmygrade());

        return "employee";
    }

    @PostMapping("/addEmployee")
    public String StudentAttendance(@ModelAttribute EmployeeDto employeeDto,
                                    BindingResult bindingResult) {

        employeeService.createEmployee(employeeDto);
        return "redirect:/home";
    }

    @ResponseBody
    @GetMapping("/getSalary/{id}")
    public List<SalaryDtoxx> getSalaryByGradeId(@PathVariable String id, @ModelAttribute SalaryDtoxx salaryDtoxx, HttpServletRequest request) {
        return employeeService.getSalaryByGradeId(id);

        //return request.setAttribute("salaryCalculateList",   employeeService.getSalaryByGradeId(id));


    }
}
