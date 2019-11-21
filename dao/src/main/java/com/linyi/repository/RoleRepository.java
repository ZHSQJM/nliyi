package com.linyi.repository;

import com.linyi.entity.Role;
import com.linyi.entity.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

/**
 * @project: linyi-parent
 * @author: zhs
 * @date: 2019/4/23 17:25
 * @package: com.linyi.repository
 * @description:
 */
public interface RoleRepository  extends JpaRepository<Role, Long>, JpaSpecificationExecutor<Role> {
    /**
     * 查找多个角色
     * @param ids id列表
     */
     List<Role> findByIdIn(List<Long> ids);


    /**
     * 通过用户名查找该用户得角色
     * @param username
     * @return
     */

    @Query(value = "  SELECT\n" +
            "\tr.*\n" +
            "FROM\n" +
            "\tsys_role r\n" +
            "LEFT JOIN sys_user_role ur ON (r.id = ur.roleId)\n" +
            "LEFT JOIN sys_user u ON (u.id = ur.userId)\n" +
            "WHERE\n" +
            "\tu.username = :username",nativeQuery = true)
    List<Role> findUserRole(@Param("username") String username);

    /**
     * 取消角色与用户之间的关系
     * @param ids 角色ID
     */
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM sys_user_role WHERE role_id in ?1", nativeQuery = true)
     Integer cancelUserJoin(List<Long> ids);
    /**
     * 取消角色与菜单之间的关系
     * @param ids 角色ID
     */
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM sys_role_menu WHERE role_id in ?1", nativeQuery = true)
     Integer cancelMenuJoin(List<Long> ids);
}
