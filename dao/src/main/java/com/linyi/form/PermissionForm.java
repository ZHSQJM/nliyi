package com.linyi.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


/**
 * @project: zblog
 * @author: zhs
 * @date: 2019/3/29 11:37
 * @package: com.zblog.form
 * @description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class PermissionForm {

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


}
