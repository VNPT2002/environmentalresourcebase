package com.environmentalresourcebase.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.environmentalresourcebase.model.SysUser;

@Repository
public interface SysUserRepository extends JpaRepository<SysUser, Long> {
	
	public SysUser findByUsername(String username);
	
	@Query("select s from SysUser s where is_active = ?1 order by fullName")
	public List<SysUser> findByIsActive(Short isActive);
}
