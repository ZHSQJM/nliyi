package com.linyi.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.apache.http.annotation.Contract;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @project: linyi-parent
 * @author: zhs
 * @date: 2019/4/29 10:57
 * @package: com.linyi.entity
 * @description: 标段信息
 */

@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "ly_bisection")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class BidSection implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    /*** 标段名称*/
    private String name;

    /*** 标段类型*/
    private Integer type;

    /*** 公司ID*/
    private Integer comppanyId;

    /**所属项目ID*/
    private Integer projectId;

    /**冗余字段 项目名称  为了显示列表页*/
    private String projectName;

    /**文件上传路径*/
    private String url;

    /**未知*/
    private String urlName;

    /**合同编号*/
    private String contractNumber;

    /**合同价格*/
    private String contractPrice;

    /**创建时间*/
    private Date createTime;

    /**修改时间*/
    private Date updateTime;


}
