package com.environmentalresourcebase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.environmentalresourcebase.model.SysRole;

@Repository
public interface SysRoleRepository  extends JpaRepository<SysRole, Long> {

}
