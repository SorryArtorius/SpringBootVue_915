package com.j16.springbootvue_915.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.github.pagehelper.PageInfo;
import com.j16.springbootvue_915.pojo.Student;
import com.j16.springbootvue_915.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Master
 */
@RestController
@RequestMapping(value = "/student",produces="application/json;charset=utf-8")
public class StudentController {

    @Resource
    StudentService studentService;

    @GetMapping("/studentList")
    public String StudentList(@RequestParam("index") int index){
        PageInfo<Student> student =  studentService.getStudentList(index,5);
        return JSON.toJSONString(student, SerializerFeature.DisableCircularReferenceDetect);
    }


    @GetMapping("/deleteStudent")
    public String deleteStudent(@RequestParam("studentNo") int studentNo){
        System.out.println(studentNo);
        String i = JSON.toJSONString(studentService.deleteStudent(studentNo));
        return  i;
    }
}
