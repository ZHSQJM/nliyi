package com.linyi.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @project: linyi-parent
 * @author: zhs
 * @date: 2019/4/24 09:18
 * @package: com.linyi.entity
 * @description:
 */

@Data
@Entity
@Table(name = "sys_user_role")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class UserRole implements Serializable {

    /**主键*/
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    /**用户Id*/
    private Long userid;

    /**0 正常使用 1逻辑删除*/
    private Long disable;

    /**角色ID*/
    private Integer roleid;

    /**创建时间*/
    private Date createtime;

    /**更新时间*/
    private Date updatetime;

    /**备用字段*/
    private String ext1;

    /**备用字段*/
    private String ext2;
}
