package com.linyi.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @project: zblog
 * @author: zhs
 * @date: 2019/3/26 10:49
 * @package: com.zblog.vo
 * @description: 左侧得菜单栏
 */
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Data
public class MenuVo implements Serializable {



    @JsonProperty("id")
    private Long id;

    /**权限名称*/
    @JsonProperty("name")
    private String name;

    /**权限图表*/
    @JsonProperty("icon")
    private String icon;

    /**权限码*/

    @JsonProperty("permissionValue")
    private String perms;

    /**权限请求地址*/
    @JsonProperty("href")
    private String resurl;

    /**权限类型 0菜单  1按钮 */
    private Integer type;

    /**上级菜单*/
    @JsonProperty("pid")
    private Long parentid;


    /**权限创建时间*/
    private Date createtime;

    /**权限更新时间*/
    private Date updatetime;

    /**逻辑删除 0 正常使用 1 逻辑删除*/
    private Integer disable;


    private List<MenuVo> list;

}
