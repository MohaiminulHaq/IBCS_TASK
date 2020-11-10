package com.example.ibcstextDemo.services;


import com.example.ibcstextDemo.domain.Grade;
import com.example.ibcstextDemo.dto.GradeDto;
import com.example.ibcstextDemo.repository.GradeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@AllArgsConstructor
@Service
public class GradeService {

    private final GradeRepository gradeRepository;

    public BigInteger createGrade(GradeDto gradeDto){


        Grade grade = new Grade();
        grade.setGradeName(gradeDto.getGradeName());
        grade.setRemarks(gradeDto.getRemarks());
        grade.setIsActive(gradeDto.getIsActive());
        gradeRepository.saveAndFlush(grade);

        return gradeDto.getId();

    }



}
