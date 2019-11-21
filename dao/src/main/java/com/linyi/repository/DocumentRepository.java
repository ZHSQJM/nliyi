package com.linyi.repository;

import com.linyi.entity.BidSection;
import com.linyi.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @project: linyi-parent
 * @author: zhs
 * @date: 2019/4/29 15:04
 * @package: com.linyi.repository
 * @description:
 */
@Repository
public interface DocumentRepository extends JpaRepository<Document, Integer>, JpaSpecificationExecutor<Document> {
}
