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
 * @date: 2019/4/29 14:58
 * @package: com.linyi.entity
 * @description: 公文
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors
@Entity
@Table(name = "ly_document")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Document  implements Serializable {

    /**主键*/
    @Id
    @GeneratedValue
    private  Integer id;

    /**类型(目前没用)*/
    private  Integer type;

    /**上传文件地址*/
    private String url;

    /**内容*/
    private String context;

    /**名称*/
    private String name;

    /**所属项目*/
    private Integer projectId;

    /**创建时间*/
    private Date createTime;

    /**更新时间*/
    private Date updateTime;
}
