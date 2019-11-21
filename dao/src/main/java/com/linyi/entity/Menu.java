package com.linyi.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

/**
 * @project: linyi-parent
 * @author: zhs
 * @date: 2019/4/23 16:56
 * @package: com.linyi.entity
 * @description:
 */

@Data
@Entity
@Table(name = "sys_permission")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Menu implements Serializable {


    /**主键*/
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    /**权限名称*/
    private String name;

    /**权限图表*/
    private String icon;

    /**权限码*/
    private String perms;

    /**权限请求地址*/
    private String resurl;

    /**权限类型 0菜单  1按钮 */
    private Integer type;

    /**上级菜单*/
    private Long parentid;

    /**权限排序*/
    private Integer sort;

    /**权限创建时间*/
    private Date createtime;

    /**权限更新时间*/
    private Date updatetime;

    /**备用字段1*/
    private String ext1;

    /**备用字段2*/
    private String ext2;

    /**逻辑删除 0 正常使用 1 逻辑删除*/
    private Integer disable;


}
