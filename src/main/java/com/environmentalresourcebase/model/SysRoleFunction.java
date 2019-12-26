package com.environmentalresourcebase.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "sys_role_function")
@SuppressWarnings("serial")
public class SysRoleFunction implements Serializable {
	@Id
	@Basic
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "role_funtion_id")
	private Long roleFuntionId;	
	
	@ManyToOne
	@JoinColumn(name = "role_id")
	private SysRole sysRole;	
	
	@ManyToOne
	@JoinColumn(name = "function_id")
	private SysFunction sysFunction;
	
	private Short readable;
	private Short writeable;
	private Short deletable;
	private Short adminable;
	
	
	public SysRoleFunction() {
		super();
	}



	public SysRoleFunction(Long roleFuntionId, SysRole sysRole, SysFunction sysFunction, Short readable,
			Short writeable, Short deletable, Short adminable) {
		super();
		this.roleFuntionId = roleFuntionId;
		this.sysRole = sysRole;
		this.sysFunction = sysFunction;
		this.readable = readable;
		this.writeable = writeable;
		this.deletable = deletable;
		this.adminable = adminable;
	}



	public Long getRoleFuntionId() {
		return roleFuntionId;
	}



	public void setRoleFuntionId(Long roleFuntionId) {
		this.roleFuntionId = roleFuntionId;
	}



	public SysRole getSysRole() {
		return sysRole;
	}



	public void setSysRole(SysRole sysRole) {
		this.sysRole = sysRole;
	}



	public SysFunction getSysFunction() {
		return sysFunction;
	}



	public void setSysFunction(SysFunction sysFunction) {
		this.sysFunction = sysFunction;
	}



	public Short getReadable() {
		return readable;
	}



	public void setReadable(Short readable) {
		this.readable = readable;
	}



	public Short getWriteable() {
		return writeable;
	}



	public void setWriteable(Short writeable) {
		this.writeable = writeable;
	}



	public Short getDeletable() {
		return deletable;
	}



	public void setDeletable(Short deletable) {
		this.deletable = deletable;
	}



	public Short getAdminable() {
		return adminable;
	}



	public void setAdminable(Short adminable) {
		this.adminable = adminable;
	}


	

}
