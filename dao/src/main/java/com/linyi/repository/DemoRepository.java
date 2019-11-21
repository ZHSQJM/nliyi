package com.linyi.repository;

import com.linyi.entity.Demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @project: linyi-parent
 * @author: zhs
 * @date: 2019/4/23 15:34
 * @package: com.linyi.repository
 * @description:
 */
@Repository
public interface DemoRepository extends JpaRepository<Demo, Integer> {
}
