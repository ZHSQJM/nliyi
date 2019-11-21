package com.linyi.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * @project: linyi-parent
 * @author: zhs
 * @date: 2019/4/23 16:54
 * @package: com.linyi.entity
 * @description:
 */

@Entity
@Table(name = "sys_role")
@Data
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Role  implements Serializable  {

    /**角色ID*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**角色名称*/
    private String rolename;

    /**角色描述*/
    private String roledesc;

    /**创建时间*/
    private Date createtime;

    /**逻辑删除  0 正常使用  1  逻辑删除*/
    private Integer disable;

    /**更新时间*/
    private Date updatetime;

    /**备用字段*/
    private String ext1;

    /**备用字段*/
    private String ext2;

}
