package com.environmentalresourcebase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.environmentalresourcebase.model.SysFunctionGroup;

@Repository
public interface SysFunctionGroupRepository extends JpaRepository<SysFunctionGroup, Long> {

}
