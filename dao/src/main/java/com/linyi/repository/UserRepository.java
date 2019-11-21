package com.linyi.repository;

import com.linyi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @project: linyi-parent
 * @author: zhs
 * @date: 2019/4/23 17:02
 * @package: com.linyi.repository
 * @description:
 */

@Repository
public interface UserRepository  extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {

    /**
     * 根据用户名查询用户数据
     * @param username 用户名
     * @return 用户数据
     */
     User findByUsername(String username);


    /**
     * 删除多条数据
     * @param ids     ID列表
     */
     Integer deleteByIdIn(List<Long> ids);




     User findByPhone(String phone);


}
