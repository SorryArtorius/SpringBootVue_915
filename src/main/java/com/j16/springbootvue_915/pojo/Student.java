package com.j16.springbootvue_915.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

/**
 * @author Master
 */
@Data
public class Student {

    @TableId(
            type = IdType.AUTO,value = "studentNo"
    )
    private int studentNo;

    @TableField("studentName")
    private String studentName;

    @TableField("loginPwd")
    private String loginPwd;

    @TableField("sex")
    private String sex;

    @TableField("gradeId")
    private int gradeId;

    @TableField("phone")
    private String phone;

    @TableField("address")
    private String address;

    @TableField("bornDate")
    private String bornDate;

    @TableField("email")
    private String email;

    @TableField("identityCard")
    private String identityCard;

    @TableField(exist = false)
    private Grade grade;
}
