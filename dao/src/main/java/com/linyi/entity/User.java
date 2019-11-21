package com.linyi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @project: linyi-parent
 * @author: zhs
 * @date: 2019/4/23 16:53
 * @package: com.linyi.entity
 * @description:
 */
@Entity
@Table(name="sys_user")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User implements Serializable  {

    /**用户ID*/
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    /**用户名*/
    private String username;

    /**密码*/
    private String password;

    /**手机号码*/
    private String phone;

    /**性别*/
    private Integer gender;

    /**真实姓名*/
    private String truename;

    /**生日*/

    @JsonFormat(pattern = "yyyy-MM-dd")
    private String birthday;

    /**邮箱*/
    private String email;

    /**个人介绍*/
    private String personalbrief;

    /**头像地址*/
    private String avatarimgurl;

    /**最近登录时间*/
    private Date recentlylanded;

    /**创建时间*/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;

    /**更新时间*/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatetime;

    /**是否被禁用*/
    private Integer disable;
}