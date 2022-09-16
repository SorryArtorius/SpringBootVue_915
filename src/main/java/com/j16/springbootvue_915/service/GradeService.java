package com.j16.springbootvue_915.service;

import com.j16.springbootvue_915.pojo.Grade;

import java.util.List;

public interface GradeService {

    Grade getGrade(int gradId);


    List<Grade> getAllGrade();
}
