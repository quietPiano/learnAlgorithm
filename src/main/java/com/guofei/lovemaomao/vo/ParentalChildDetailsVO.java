package com.gf.crm.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 家长/学生信息表
 *
 * @author 阿甘
 * @email zhaoyf@weilaicheng.com
 * @date 2019-02-27 16:26:25
 */
@Data
public class ParentalChildDetailsVO implements Serializable {
    private static final long serialVersionUID = 1L;

    // 家长孩子ID
    private String id;

    // 线索ID
    private String clueId;

    // 家长姓名
    private String parentalName;

    // 家长手机号
    private String parentalPhone;

    // 家长微信好
    private String parentalWeixin;

    // 孩子姓名
    private String childName;

    // 孩子性别
    private String childGender;

    // 孩子出生日期
    private Date childBirthDate;

    //学生电话
    private String childPhone;

    // 孩子年龄
    private Integer childAge = 0;

    // 孩子琴龄
    private Float childPianoAge = 0.0F;

    // 计划考级
    private String gradingTest;

    // 考级教材
    private String teachingMaterial;

    // 备注
    private String remark;

    // 学习问题
    private String learningProblems;

    // 省份
    private String province;

    // 所在城市
    private String city;

    // 所在区县
    private String area;
}
