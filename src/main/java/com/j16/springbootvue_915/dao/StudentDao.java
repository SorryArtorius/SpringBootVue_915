package com.j16.springbootvue_915.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.j16.springbootvue_915.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Master
 */

@Mapper
public interface StudentDao extends BaseMapper<Student> {

    List<Student> getStudentList();

}
