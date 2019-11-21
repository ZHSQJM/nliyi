package com.linyi.repository;

import com.linyi.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @project: linyi-parent
 * @author: zhs
 * @date: 2019/4/23 17:27
 * @package: com.linyi.repository
 * @description:
 */
public interface MenuRepository   extends JpaRepository<Menu, Long>, JpaSpecificationExecutor<Menu> {

    /**
     * 通过用户名查找用户的所有权限
     * @param userName
     * @return
     */
    @Query(value = "select m.* from sys_role r\n" +
            "        left join sys_user_role ur on(r.id = ur.roleId)\n" +
            "        left join sys_user u on(u.id = ur.userId)\n" +
            "        left join sys_role_permission rm on(rm.roleId = r.id)\n" +
            "        left join sys_permission m on(m.id = rm.permissionId )\n" +
            "        where u.username = :username and m.perms is not null and m.`disable` =0" ,nativeQuery = true)
    List<Menu> findUserPermissions(@Param("username") String userName);


    /**
     * 根据用户名查找权限
     * @param roleId
     * @return
     */
    @Query(value = " select p.*\n" +
            "        from sys_permission p\n" +
            "        INNER  JOIN sys_role_permission d on d.permissionId=p.id\n" +
            "        where d.roleId=:roleId and   d.disable=0",nativeQuery = true)
    List<Menu> loadByRoleId(@Param("roleId") Integer roleId);


    @Transactional
    Integer deleteByIdIn(List<Long> ids);

    /**
     * 查找这个角色下面的所有权限
     * @param id
     * @return
     */
    @Query(value = "select p.* from sys_permission p INNER  JOIN sys_role_permission d on d.permissionId=p.id where d.roleId=:roleId and d.disable=0",nativeQuery = true)
    List<Menu> loadByRoleId(@Param("roleId") Long id);
}
