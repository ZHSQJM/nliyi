package com.linyi.repository;

import com.linyi.entity.Menu;
import com.linyi.entity.Role;
import com.linyi.entity.RoleMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @project: linyi-parent
 * @author: zhs
 * @date: 2019/4/24 13:21
 * @package: com.linyi.repository
 * @description:
 */
public interface RolePermissionRepisitory  extends JpaRepository<RoleMenu, Long>, JpaSpecificationExecutor<RoleMenu> {




    /**
     * 根据角色查询这个角色得角色与权限相关表
     * @param roleId
     * @return
     */
    List<RoleMenu> findByRoleid(Long roleId);
}
