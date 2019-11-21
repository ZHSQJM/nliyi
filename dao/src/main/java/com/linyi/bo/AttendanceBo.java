package com.linyi.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @project: linyi-parent
 * @author: zhs
 * @date: 2019/4/29 17:23
 * @package: com.linyi.bo
 * @description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class AttendanceBo {

    private Integer id;

    /**考勤时间*/
    private Date createTime;

    /**考勤姓名*/
    private String name;

    /**考勤的设备序号*/
    private String checkSn;

    /**考勤人员Id*/
    private String checkId;

}
