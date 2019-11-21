package com.linyi.repository;

import com.linyi.entity.BidSection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @project: linyi-parent
 * @author: zhs
 * @date: 2019/4/29 11:09
 * @package: com.linyi.repository
 * @description:
 */
@Repository
public interface BidSectionRepository  extends JpaRepository<BidSection, Integer>, JpaSpecificationExecutor<BidSection> {
}
