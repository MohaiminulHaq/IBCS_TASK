package com.example.ibcstextDemo.services;


import com.example.ibcstextDemo.domain.Grade;
import com.example.ibcstextDemo.domain.SalaryCalculate;
import com.example.ibcstextDemo.dto.SalaryDto;
import com.example.ibcstextDemo.repository.GradeRepository;
import com.example.ibcstextDemo.repository.SalaryCalculateRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class SalaryService {

    private final SalaryCalculateRepository salaryCalculateRepository;
    private final GradeRepository gradeRepository;

    public BigInteger createSalary(SalaryDto salaryDto) {

        List<Grade> gradeList1= gradeRepository.findAllByGradeName(salaryDto.getGradeName());

        for (Grade grade : gradeList1) {

            Optional<SalaryCalculate> salaryCalculateOptional = salaryCalculateRepository.findAllByGradeId(grade.getId());

            if (!salaryCalculateOptional.isPresent()) {

                if (salaryDto.getGradeName().equals("grade_6")) {

                    SalaryCalculate salaryCalculate = new SalaryCalculate();

                    List<Grade> gradeList= gradeRepository.findAllByGradeName(salaryDto.getGradeName());

                    for (Grade grade1 : gradeList) {
                        salaryCalculate.setGrade(grade1);
                    }
                    salaryCalculate.setBasicSalary(salaryDto.getBasicSalary());

                    salaryCalculateRepository.saveAndFlush(salaryCalculate);
                }

                else if (salaryDto.getGradeName().equals("grade_5")) {

                    BigInteger bigInteger = new BigInteger("6");

                    Optional<SalaryCalculate> salaryCalculateOptiona5 = salaryCalculateRepository.findAllByGradeId(bigInteger);

                    SalaryCalculate salaryCalculate = salaryCalculateOptiona5.get();


                    double basicIncriment;
                    double basicIncrimentAmount = 5000.00;
                    double houseRant;
                    double medicaleA;
                    double total;

                    basicIncriment = salaryCalculate.getBasicSalary();
                    houseRant = (basicIncriment)*0.2;
                    medicaleA = (basicIncriment)*0.15;

                    total = (basicIncriment+houseRant+medicaleA+basicIncrimentAmount);

                    SalaryCalculate salaryCalculate1 = new SalaryCalculate();
                    List<Grade> gradeList= gradeRepository.findAllByGradeName(salaryDto.getGradeName());

                    for (Grade grade1 : gradeList) {
                        salaryCalculate1.setGrade(grade1);
                    }

                    salaryCalculate1.setBasicSalary(total);

                    salaryCalculateRepository.saveAndFlush(salaryCalculate1);

                }

                else if (salaryDto.getGradeName().equals("grade_4")) {

                    BigInteger bigInteger = new BigInteger("5");

                    Optional<SalaryCalculate> salaryCalculateOptiona5 = salaryCalculateRepository.findAllByGradeId(bigInteger);

                    SalaryCalculate salaryCalculate = salaryCalculateOptiona5.get();


                    double total;
                    double basicIncriment = salaryCalculate.getBasicSalary();
                    double basicIncrimentAmount = 5000.00;


                    total = (basicIncriment+basicIncrimentAmount);

                    SalaryCalculate salaryCalculate1 = new SalaryCalculate();
                    List<Grade> gradeList= gradeRepository.findAllByGradeName(salaryDto.getGradeName());

                    for (Grade grade1 : gradeList) {
                        salaryCalculate1.setGrade(grade1);
                    }

                    salaryCalculate1.setBasicSalary(total);

                    salaryCalculateRepository.saveAndFlush(salaryCalculate1);


                }

                else if (salaryDto.getGradeName().equals("grade_3")) {

                    BigInteger bigInteger = new BigInteger("4");

                    Optional<SalaryCalculate> salaryCalculateOptiona5 = salaryCalculateRepository.findAllByGradeId(bigInteger);

                    SalaryCalculate salaryCalculate = salaryCalculateOptiona5.get();


                    double total;
                    double basicIncriment = salaryCalculate.getBasicSalary();
                    double basicIncrimentAmount = 5000.00;


                    total = (basicIncriment+basicIncrimentAmount);

                    SalaryCalculate salaryCalculate1 = new SalaryCalculate();
                    List<Grade> gradeList= gradeRepository.findAllByGradeName(salaryDto.getGradeName());

                    for (Grade grade1 : gradeList) {
                        salaryCalculate1.setGrade(grade1);
                    }

                    salaryCalculate1.setBasicSalary(total);

                    salaryCalculateRepository.saveAndFlush(salaryCalculate1);


                }

                else if (salaryDto.getGradeName().equals("grade_2")) {

                    BigInteger bigInteger = new BigInteger("3");

                    Optional<SalaryCalculate> salaryCalculateOptiona5 = salaryCalculateRepository.findAllByGradeId(bigInteger);

                    SalaryCalculate salaryCalculate = salaryCalculateOptiona5.get();


                    double total;
                    double basicIncriment = salaryCalculate.getBasicSalary();
                    double basicIncrimentAmount = 5000.00;


                    total = (basicIncriment+basicIncrimentAmount);

                    SalaryCalculate salaryCalculate1 = new SalaryCalculate();
                    List<Grade> gradeList= gradeRepository.findAllByGradeName(salaryDto.getGradeName());

                    for (Grade grade1 : gradeList) {
                        salaryCalculate1.setGrade(grade1);
                    }

                    salaryCalculate1.setBasicSalary(total);

                    salaryCalculateRepository.saveAndFlush(salaryCalculate1);


                }

                else if (salaryDto.getGradeName().equals("grade_1")) {

                    BigInteger bigInteger = new BigInteger("2");

                    Optional<SalaryCalculate> salaryCalculateOptiona5 = salaryCalculateRepository.findAllByGradeId(bigInteger);

                    SalaryCalculate salaryCalculate = salaryCalculateOptiona5.get();


                    double total;
                    double basicIncriment = salaryCalculate.getBasicSalary();
                    double basicIncrimentAmount = 5000.00;


                    total = (basicIncriment+basicIncrimentAmount);

                    SalaryCalculate salaryCalculate1 = new SalaryCalculate();
                    List<Grade> gradeList= gradeRepository.findAllByGradeName(salaryDto.getGradeName());

                    for (Grade grade1 : gradeList) {
                        salaryCalculate1.setGrade(grade1);
                    }

                    salaryCalculate1.setBasicSalary(total);

                    salaryCalculateRepository.saveAndFlush(salaryCalculate1);


                }


                else {
                    throw new RuntimeException ("Not found Grade");
                }

            }

            else {
                throw new RuntimeException ("Already Exit");
            }



        }



















        return salaryDto.getId();

    }



}
