package com.linyi.form;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import java.util.Date;

/**
 * @project: linyi-parent
 * @author: zhs
 * @date: 2019/4/28 11:58
 * @package: com.linyi.form
 *  @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$",message = "手机号码格式错误")
 *
 @ApiModelProperty(value="开工时间",name="startDate",example="2018/7/7 11:11:00")
 * @description: 项目表单提交
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class ProjectForm {

    private Integer id;

    /**项目名称*/
    @ApiModelProperty(value="电话号码",name="projectName",required=true,example="XXX项目")
    @NotEmpty(message = "项目名称不能为空")
    private String projectName;

    /**开工时间*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;

    /**完工时间时间*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;

    /**项目类型*/
    @ApiModelProperty(value="项目类型",name="projectType",required=true,example="1")
    @NotNull(message = "项目类型不能为空")
    private Integer projectType;

    /**工程类型*/
    @ApiModelProperty(value="工程类型",name="engineeringType",required=true,example="1")
    @NotNull(message = "工程类型不能为空")
    private Integer engineeringType;

    /**公路类型*/
    @ApiModelProperty(value="公路类型",name="highwayType",required=true,example="1")
    @NotNull(message = "项目名称不能为空")
    private Integer highwayType;

    /**项目负责人*/
    @ApiModelProperty(value="项目负责人",name="chargePerson",required=true,example="李XX")
    @NotEmpty(message = "项目负责人不能为空")
    private  String   chargePerson;

    /**联系人电话*/
    @ApiModelProperty(value="联系人电话",name="telephone",required=true,example="138XXXX1236")
    @NotEmpty(message = "联系人电话不能为空")
    @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$",message = "手机号码格式错误")
    private String telephone;

    /**项目地址*/
    @ApiModelProperty(value="项目地址",name="address",required=true,example="XXX省XXX市")
    @NotEmpty(message = "项目名称不能为空")
    private String address;

    /**项目负责人职务*/
    @ApiModelProperty(value="项目负责人职务",name="chargepost",required=true,example="监理")
    private String chargepost;

    /**项目负责人职称*/
    @ApiModelProperty(value="项目负责人职称",name="chargetitle",required=true,example="博士")
    private  String chargetitle;

    /**项目负责人职务证书号*/
    @ApiModelProperty(value="项目负责人职务证书号",name="chargecertificateNumber",required=true,example="1225455XXX452")
    private  String chargecertificateNumber;

    /**技术负责人*/
    @ApiModelProperty(value="技术负责人",name="technicalPerson",required=true,example="洲XXX")
    private String  technicalPerson;

    /**技术负责人职务*/
    @ApiModelProperty(value="技术负责人职务",name="technicalpost",required=true,example="业主")
    private String technicalpost;

    /**技术负责人职称*/
    @ApiModelProperty(value="技术负责人职称",name="technicaltitle",required=true,example="教授")
    private String technicaltitle;

    /**技术负责人证书号*/
    @ApiModelProperty(value="技术负责人证书号",name="technicalNumber",required=true,example="1111122")
    private  String technicalNumber;

    /**描述*/
    @ApiModelProperty(value="描述",name="description",required=true,example="该项目开始以.....主要路段...结束一....")
    private String description;

}
