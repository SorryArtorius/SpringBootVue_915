package com.j16.springbootvue_915.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.j16.springbootvue_915.service.GradeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Master
 */
@RestController
@RequestMapping(value = "/grade",produces="application/json;charset=utf-8")
public class GradeController {

    @Resource
    GradeService gradeService;


    @RequestMapping(value = "getAllGrade",method = RequestMethod.GET)
    public String getAllGrade(){
        return JSON.toJSONString(gradeService.getAllGrade(), SerializerFeature.DisableCircularReferenceDetect);
    }
}
