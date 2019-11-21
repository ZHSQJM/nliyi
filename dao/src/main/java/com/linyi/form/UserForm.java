package com.linyi.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @project: zblog
 * @author: zhs
 * @date: 2019/3/28 14:11
 * @package: com.zblog.form
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class UserForm {

    private  Long id;


    /**用户名*/
    @NotNull(message = "用户名不能为空")
    private String username;

    /**密码*/

    @NotNull(message = "密码不能为空")
    @Size(min = 6,max = 12,message = "密码长度在6-12之间")
    private String password;

    /**手机号码*/
    @NotNull(message = "手机号码不能为空")
    @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$",message = "手机号码格式错误")
    private String phone;

    /**性别*/
    @NotNull(message = "性别不能为空")
    private Integer gender;

}
