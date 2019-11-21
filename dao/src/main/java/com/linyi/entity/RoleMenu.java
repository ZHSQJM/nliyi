package com.linyi.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @decription: 角色权限关系映射表
 * @author: zhs
 * @date: 2019/3/25 14:20
 * @version: v1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "sys_role_permission")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class RoleMenu implements Serializable {

    /**主键*/
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    /**角色id*/
    private Long roleid;

    /**0 正常使用  1 逻辑删除*/
    private Integer disable;

    /**权限id*/
    private Long permissionid;

    /**创建时间*/
    private Date createtime;

    /**更新时间*/
    private Date updatetime;

    /**备用字段*/
    private String ext1;

    /**备用字段*/
    private String ext2;


}