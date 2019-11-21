package com.linyi.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.NotEmpty;


import javax.validation.constraints.NotNull;

/**
 * @project: linyi-parent
 * @author: zhs
 * @date: 2019/4/29 11:08
 * @package: com.linyi.form
 * @description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class BidSectionForm {

    private Integer id;

    /*** 标段名称*/

    @NotEmpty(message = "标段信息不能为空")
    private String name;

    /*** 标段类型*/
    @NotNull(message = "标段类型不能为空")
    private Integer type;

    /*** 公司ID*/
    private Integer comppanyId;

    /**未知*/
    private String urlName;

    /**合同编号*/
    @NotEmpty(message = "合同编号不能为空")
    private String contractNumber;

    /**合同价格*/
    @NotEmpty(message = "合同价格不能为空")
    private String contractPrice;
}
