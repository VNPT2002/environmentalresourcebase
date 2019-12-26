package com.environmentalresourcebase.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "sys_function")
@SuppressWarnings("serial")
public class SysFunction implements Serializable {
	@Id
	@Basic
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "function_id")
	private Long functionId;
	
	@ManyToOne
	@JoinColumn(name = "function_group_id")	
	private SysFunctionGroup sysFunctionGroup;
	
	@ManyToOne
	@JoinColumn(name = "function_father_id")
	private SysFunction sysFunction;
	
	@Basic
	@Column(name = "code", length = 50)
	private String code;
	
	@Basic
	@Column(name = "name", length = 100)
	private String name;
	
	@Basic
	@Column(name = "description", length = 255)
	private String description;
	
	@Basic
	@Column(name = "target_form", length = 255)
	private String targetForm;
	
	@Basic
	@Column(name = "module_folder", length = 50)
	private String moduleFolder;
	
	@Basic
	@Column(name = "naviget_url", length = 255)
	private String navigetUrl;
	
	@Basic
	@Column(name = "icon_url", length = 255)
	private String iconUrl;
	
	@Basic
	@Column(name = "show_menu")
	private Short showMenu = 0;
	
	@Basic
	@Column(name = "display_order")
	private Double displayOrder;
	
	@Basic
	@Column(name = "is_active")
	private Short isActive = 1;

	public SysFunction() {
		super();
	}

	public SysFunction(Long functionId, SysFunctionGroup sysFunctionGroup, SysFunction sysFunction, String code,
			String name, String description, String targetForm, String moduleFolder, String navigetUrl, String iconUrl,
			Short showMenu, Double displayOrder, Short isActive) {
		super();
		this.functionId = functionId;
		this.sysFunctionGroup = sysFunctionGroup;
		this.sysFunction = sysFunction;
		this.code = code;
		this.name = name;
		this.description = description;
		this.targetForm = targetForm;
		this.moduleFolder = moduleFolder;
		this.navigetUrl = navigetUrl;
		this.iconUrl = iconUrl;
		this.showMenu = showMenu;
		this.displayOrder = displayOrder;
		this.isActive = isActive;
	}

	public Long getFunctionId() {
		return functionId;
	}
	public void setFunctionId(Long functionId) {
		this.functionId = functionId;
	}

	
	public SysFunctionGroup getSysFunctionGroup() {
		return sysFunctionGroup;
	}
	public void setSysFunctionGroup(SysFunctionGroup sysFunctionGroup) {
		this.sysFunctionGroup = sysFunctionGroup;
	}
	
	public SysFunction getSysFunction() {
		return sysFunction;
	}
	public void setSysFunction(SysFunction sysFunction) {
		this.sysFunction = sysFunction;
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
	public String getTargetForm() {
		return targetForm;
	}
	public void setTargetForm(String targetForm) {
		this.targetForm = targetForm;
	}
	public String getModuleFolder() {
		return moduleFolder;
	}
	public void setModuleFolder(String moduleFolder) {
		this.moduleFolder = moduleFolder;
	}
	public String getNavigetUrl() {
		return navigetUrl;
	}
	public void setNavigetUrl(String navigetUrl) {
		this.navigetUrl = navigetUrl;
	}
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	public Short getShowMenu() {
		return showMenu;
	}
	public void setShowMenu(Short showMenu) {
		this.showMenu = showMenu;
	}
	public Double getDisplayOrder() {
		return displayOrder;
	}
	public void setDisplayOrder(Double displayOrder) {
		this.displayOrder = displayOrder;
	}
	public Short getIsActive() {
		return isActive;
	}
	public void setIsActive(Short isActive) {
		this.isActive = isActive;
	}
}
