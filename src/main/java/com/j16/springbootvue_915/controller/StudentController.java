package com.j16.springbootvue_915.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.github.pagehelper.PageInfo;
import com.j16.springbootvue_915.pojo.Student;
import com.j16.springbootvue_915.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author Master
 */
@RestController
@RequestMapping(value = "/student", produces = "application/json;charset=utf-8")
public class StudentController {

    @Resource
    StudentService studentService;

    @GetMapping("/studentList")
    public String StudentList(@RequestParam("index") int index) {
        PageInfo<Student> student = studentService.getStudentList(index, 5);
        return JSON.toJSONString(student, SerializerFeature.DisableCircularReferenceDetect);
    }


    @GetMapping("/deleteStudent")
    public String deleteStudent(@RequestParam("studentNo") int studentNo) {
        return JSON.toJSONString(studentService.deleteStudent(studentNo));
    }

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student) {
        System.out.println(student);
        student.setGradeId(student.getGrade().getGradeId());
        return JSON.toJSONString(studentService.addStudent(student));
    }

    @GetMapping("/getStudentNoNumber")
    public void getStudentByGradeId(@RequestParam("studentNo") int studentNo, HttpServletRequest request) {
        request.getSession().setAttribute("studentNo", studentNo);
    }

    @GetMapping("/editStudentDate")
    public String editStudentDate(HttpServletRequest request) {
        int studentNo = (int) request.getSession().getAttribute("studentNo");
        return JSON.toJSONString(studentService.getStudent(studentNo), SerializerFeature.DisableCircularReferenceDetect);
    }

    @PostMapping("/updateStudent")
    public String updateStudent(@RequestBody Student student) {
        System.out.println(student);
        return JSON.toJSONString(studentService.updateStudent(student));
    }


    /**
     * 空气墙
     */
    @GetMapping("airWall")
    public String airWall(HttpServletRequest request) {
        if (request.getSession().getAttribute("studentNo") != null) {
            return "true";
        } else {
            return "false";
        }

    }
}
