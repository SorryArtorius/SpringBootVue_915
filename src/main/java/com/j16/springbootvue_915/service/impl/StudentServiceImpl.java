package com.j16.springbootvue_915.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.j16.springbootvue_915.dao.StudentDao;
import com.j16.springbootvue_915.pojo.Student;
import com.j16.springbootvue_915.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    StudentDao studentDao;

    @Override
    public PageInfo<Student> getStudentList(int index,int page) {
        PageHelper.startPage(index,page);
        return new PageInfo<>(studentDao.getStudentList());
    }

    @Override
    public List<Student> studentList() {
        return studentDao.getStudentList();
    }

    @Override
    public int deleteStudent(int studentNo) {
        return studentDao.deleteById(studentNo);
    }

    @Override
    public int addStudent(Student student) {
        return studentDao.insert(student);
    }
}
