package com.environmentalresourcebase.model;

import java.io.Serializable;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "sys_role")
@SuppressWarnings("serial")
public class SysRole  implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long role_id;	
	
	@Basic
	@Column(name = "code", length = 10)
	private String code;
	
	@Basic
	@Column(name = "name", length = 100)
	private String name;
	
	@Basic
	@Column(name = "description", length = 200)
	private String description;

	public SysRole() {
		
	}
		
	public SysRole(Long role_id, String code, String name, String description) {
		super();
		this.role_id = role_id;
		this.code = code;
		this.name = name;
		this.description = description;
	}

	public Long getRole_id() {
		return role_id;
	}

	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
