package com.environmentalresourcebase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.environmentalresourcebase.model.SysFunction;

@Repository
public interface SysFunctionRepository extends JpaRepository<SysFunction, Long> {

}
