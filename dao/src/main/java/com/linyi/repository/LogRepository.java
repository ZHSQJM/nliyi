package com.linyi.repository;


import com.linyi.entity.SysLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @project: linyi-parent
 * @author: zhs
 * @date: 2019/4/24 16:59
 * @package: com.linyi.repository
 * @description:
 */
public interface LogRepository  extends JpaRepository<SysLog, Long>, JpaSpecificationExecutor<SysLog> {
}
