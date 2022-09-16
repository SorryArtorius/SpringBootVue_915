package com.j16.springbootvue_915.service.impl;

import com.j16.springbootvue_915.dao.GradeDao;
import com.j16.springbootvue_915.pojo.Grade;
import com.j16.springbootvue_915.service.GradeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GradeServiceImpl implements GradeService {
    @Resource
    GradeDao gradeDao;


    @Override
    public Grade getGrade(int gradId) {
        return gradeDao.getGrade(gradId);
    }

    @Override
    public List<Grade> getAllGrade() {
        return gradeDao.selectList(null);
    }
}
