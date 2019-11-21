package com.linyi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @project: linyi-parent
 * @author: zhs
 * @date: 2019/4/29 17:02
 * @package: com.linyi.entity
 * @description: 考勤数据
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ly_attendance")
@Accessors(chain = true)
public class Attendance {


    @Id
    @GeneratedValue
    private Integer id;

    /**考勤时间*/
    private Date createTime;

    /**考勤姓名*/
    private String name;

    /**考勤的设备序号*/
    private String checkSn;

    /**考勤人员Id*/
    private String checkId;

    /**部门名称*/
    private Integer deptCode;

    /**年月日*/
    private String date;

}
