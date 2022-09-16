package com.j16.springbootvue_915.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.j16.springbootvue_915.pojo.Grade;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Master
 */
@Mapper
public interface GradeDao extends BaseMapper<Grade> {


    Grade getGrade(int gradId);

}
