package com.linyi.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @project: zblog
 * @author: zhs
 * @date: 2019/3/27 15:27
 * @package: com.zblog.vo
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class UserVo {


    /**主键*/
    private Integer id;

    /**用户名*/
    private String username;

    /**手机号码*/
    private String phone;

    /**性别*/
    private String gender;

    /**真实姓名*/
    private String truename;

    /**生日*/

    @JsonFormat(pattern = "yyyy-MM-dd")
    private String birthday;

    /**邮箱*/
    private String email;


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
