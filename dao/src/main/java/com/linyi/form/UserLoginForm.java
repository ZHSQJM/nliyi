package com.linyi.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @project: zblog
 * @author: zhs
 * @date: 2019/3/26 10:13
 * @package: com.zblog.form
 * @description: 登录表单
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class UserLoginForm {


    private String username;

    private  String password;

    private boolean rememberMe;
}
