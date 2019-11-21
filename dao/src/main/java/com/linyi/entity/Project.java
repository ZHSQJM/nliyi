package com.linyi.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @project: linyi-parent
 * @author: zhs
 * @date: 2019/4/28 11:44
 * @package: com.linyi.entity
 * @description:
 */

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Accessors(chain = true)
@Table(name = "ly_project")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Project implements Serializable {


    /**主键 项目的Id*/
    @Id
    @GeneratedValue
    private Integer id;

    /**项目名称*/
    private String projectName;

    /**开工时间*/
    private Date startDate;

    /**完工时间时间*/
    private Date endDate;

    /**项目类型*/
    private Integer projectType;

    /**工程类型*/
    private Integer engineeringType;

    /**公路类型*/
    private Integer highwayType;

    /**项目负责人*/
    private  String   chargePerson;

    /**联系人电话*/
    private String telephone;

    /**项目地址*/
    private String address;

    /**项目负责人职务*/
    private String chargepost;

    /**项目负责人职称*/
    private  String chargetitle;

    /**项目负责人职务证书号*/
    private  String chargecertificateNumber;

    /**技术负责人*/
    private String  technicalPerson;

    /**技术负责人职务*/
    private String technicalpost;

    /**技术负责人职称*/
    private String technicaltitle;

    /**技术负责人证书号*/
    private  String technicalNumber;

    /**描述*/
    private String description;

    /**创建时间*/
    private Date createTime;

    /**更新时间*/
    private Date updateTime;

    /**项目对应的管控的Id*/
    private  Integer ccId;

    /**项目对应的管控的名称*/
    private String ccProjectName;
}
