package com.linyi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @decription: 日志表关系映射
 * @author: zhs
 * @date: 2019/3/25 14:19
 * @version: v1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "sys_log")
public class SysLog implements Serializable {

    /**主键*/
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    /**操作用户*/
    private String username;

    /**操作的模块*/
    private String operation;

    /**响应时间*/
    private Integer time;

    /**请求的方法*/
    private String method;

    /**请求参数*/
    private String params;

    /**操作电脑IP*/
    private String ip;

    /**操作时间*/
    private Date gmtcreate;

    /**日志逻辑删除*/
    private Integer disable;


}