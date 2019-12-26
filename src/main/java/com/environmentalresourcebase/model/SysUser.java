package com.environmentalresourcebase.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "sys_user")
@SuppressWarnings("serial")
public class SysUser  implements Serializable {

	@Id
	@Basic
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Long userId;	
	
	@ManyToOne 
	@JoinColumn(name = "user_group_id")
	private SysUserGroup sysUserGroup;
	
	@Basic
	@Column(name = "username", length = 20, nullable = false, unique = true)
	private String username;	
	@Basic
	@Column(name = "password", length = 60)
	private String password;	
	@Basic
	@Column(name = "full_name", length = 255)
	private String fullName;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date birthday;
	@Basic
	@Column(name = "gender")
	private Short gender = 0;
	@Basic
	@Column(name = "home_address", length = 255)
	private String homeAddress;
	@Basic
	@Column(name = "home_phone", length = 30)
	private String homePhone;
	@Basic
	@Column(name = "mobile", length = 30)
	private String mobile;
	@Basic
	@Column(name = "home_email", length = 50)
	private String homeEmail;
	@Basic
	@Column(name = "home_fax", length = 30)
	private String homeFax;
	@Basic
	@Column(name = "company_name", length = 255)
	private String companyName;
	@Basic
	@Column(name = "company_address", length = 255)
	private String companyAddress;
	@Basic
	@Column(name = "company_phone", length = 30)
	private String companyPhone;
	@Basic
	@Column(name = "company_email", length = 50)
	private String companyEmail;
	@Basic
	@Column(name = "company_fax", length = 30)
	private String companyFax;
	@Basic
	@Column(name = "description", length = 255)
	private String description;
	@Basic
	@Column(name = "is_active")
	private Short isActive = 1;
	@Basic
	@Column(name = "last_Password_Reset")
	private Date lastPasswordResetDate;
	
	@Access(AccessType.PROPERTY)
	@ManyToMany(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinTable(name = "sys_user_permission", joinColumns = {@JoinColumn(name = "user_id")}, inverseJoinColumns = {@JoinColumn(name = "role_id")})
	private Set<SysRole> sysRoles = new HashSet<SysRole>();	
			
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public SysUserGroup getSysUserGroup() {
		return sysUserGroup;
	}
	public void setSysUserGroup(SysUserGroup sysUserGroup) {
		this.sysUserGroup = sysUserGroup;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Short getGender() {
		return gender;
	}
	public void setGender(Short gender) {
		this.gender = gender;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public String getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getHomeEmail() {
		return homeEmail;
	}
	public void setHomeEmail(String homeEmail) {
		this.homeEmail = homeEmail;
	}
	public String getHomeFax() {
		return homeFax;
	}
	public void setHomeFax(String homeFax) {
		this.homeFax = homeFax;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public String getCompanyPhone() {
		return companyPhone;
	}
	public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
	}
	public String getCompanyEmail() {
		return companyEmail;
	}
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}
	public String getCompanyFax() {
		return companyFax;
	}
	public void setCompanyFax(String companyFax) {
		this.companyFax = companyFax;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Short getIsActive() {
		return isActive;
	}
	public void setIsActive(Short isActive) {
		this.isActive = isActive;
	}
	public Date getLastPasswordResetDate() {
		return lastPasswordResetDate;
	}
	public void setLastPasswordResetDate(Date lastPasswordResetDate) {
		this.lastPasswordResetDate = lastPasswordResetDate;
	}
	
	public Set<SysRole> getSysRoles() {
		return sysRoles;
	}
	public void setSysRoles(Set<SysRole> sysRoles) {
		this.sysRoles = sysRoles;
	}
}
