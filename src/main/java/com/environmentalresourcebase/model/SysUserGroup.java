package com.environmentalresourcebase.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "sys_user_group")
@SuppressWarnings("serial")
public class SysUserGroup implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long user_group_id;	
	private String code;
	private String name;
	private String description;
	private Set<SysRole> sysRoles = new HashSet<SysRole>();
	
	
	public Long getUser_group_id() {
		return user_group_id;
	}
	public void setUser_group_id(Long user_group_id) {
		this.user_group_id = user_group_id;
	}
	
	@Basic
	@Column(name = "code", length = 10)
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	@Basic
	@Column(name = "name", length = 100)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Basic
	@Column(name = "description", length = 255)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Access(AccessType.PROPERTY)
	@ManyToMany(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinTable(name = "sys_user_group_permission", joinColumns = @JoinColumn(name = "user_group_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	public Set<SysRole> getSysRoles() {
		return sysRoles;
	}
	public void setSysRoles(Set<SysRole> sysRoles) {
		this.sysRoles = sysRoles;
	}
	
	
}
