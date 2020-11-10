package com.example.ibcstextDemo.controller;

;
import com.example.ibcstextDemo.dto.SalaryDto;
import com.example.ibcstextDemo.services.EmployeeService;
import com.example.ibcstextDemo.services.SalaryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@AllArgsConstructor
public class SalarydistributionController {

    public final EmployeeService employeeService;
    public final SalaryService salaryService;

    @GetMapping("/salarydistribution")
    public String grade (HttpServletRequest request) {
        request.setAttribute("gradeList", employeeService.showmygrade());
        return "salarydistribution";
    }

    @PostMapping("/addSalary")
    public String StudentAttendance(@ModelAttribute SalaryDto salaryDto,
                                    BindingResult bindingResult) {

        salaryService.createSalary(salaryDto);
        return "redirect:/home";
    }
}
