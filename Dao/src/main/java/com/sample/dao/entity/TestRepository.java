package com.sample.dao.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends  JpaRepository<TestEntity, Long>{

}
