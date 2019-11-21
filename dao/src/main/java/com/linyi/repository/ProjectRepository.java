package com.linyi.repository;

import com.linyi.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @project: linyi-parent
 * @author: zhs
 * @date: 2019/4/28 11:57
 * @package: com.linyi.repository
 * @description:
 */
@Repository
public interface ProjectRepository  extends JpaRepository<Project, Integer> {


}
