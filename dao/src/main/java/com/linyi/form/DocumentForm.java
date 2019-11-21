package com.linyi.form;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

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
public class DocumentForm {

    /**主键*/
    private  Integer id;


    /**内容*/
    @ApiModelProperty(value="内容",name="context",required=true,example="1")
    @NotNull(message = "内容不能为空")
    private String context;

    /**名称*/
    @ApiModelProperty(value="名称",name="name",required=true,example="1")
    @NotNull(message = "名称不能为空")
    private String name;

}
