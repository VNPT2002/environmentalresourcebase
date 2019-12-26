package com.environmentalresourcebase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.environmentalresourcebase.model.SysRoleFunction;

@Repository
public interface SysRoleFunctionRepository extends JpaRepository<SysRoleFunction, Long>{

}
