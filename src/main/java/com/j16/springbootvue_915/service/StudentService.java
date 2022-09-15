package com.j16.springbootvue_915.service;

import com.github.pagehelper.PageInfo;
import com.j16.springbootvue_915.pojo.Student;

import java.util.List;

public interface StudentService {

    PageInfo<Student> getStudentList(int index,int page);

    List<Student> studentList();

    int deleteStudent(int studentNo);
}
