package com.j16.springbootvue_915.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author Master
 */
@Data
public class Grade {

    @TableId(
            type = IdType.AUTO,value = "gradeId"
    )
    private int gradeId;

    @TableField(value = "gradeName")
    private String gradeName;
}
