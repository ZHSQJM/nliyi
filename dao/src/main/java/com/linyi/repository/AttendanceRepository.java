package com.linyi.repository;

import com.linyi.entity.Attendance;
import com.linyi.entity.BidSection;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @project: linyi-parent
 * @author: zhs
 * @date: 2019/4/29 17:02
 * @package: com.linyi.entity
 * @description:
 */
@Repository
public interface AttendanceRepository  extends JpaRepository<Attendance, Integer>, JpaSpecificationExecutor<Attendance> {



}
