package com.environmentalresourcebase.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "sys_function_group")
@SuppressWarnings("serial")
public class SysFunctionGroup implements Serializable {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic
	@Column(name = "function_group_id")
	private Long functionGroupId;	
	
	@Basic
	@Column(name = "code", length = 10)
	private String code;
	
	@Basic
	@Column(name = "name", length = 100)
	private String name;
	
	@Basic
	@Column(name = "description", length = 200)
	private String description;
	
	@Basic
	@Column(name = "target_form", length = 200)
	private String targetForm;
	
	@Basic
	@Column(name = "navigate_url", length = 200)
	private String navigateUrl;
	
	@Basic
	@Column(name = "icon_url", length = 200)
	private String iconUrl;
	
	@Basic
	@Column(name = "show_menu")
	private Short showMenu;
	
	@Basic
	@Column(name = "display_order")
	private Double displayOrder;
	
	@Basic
	@Column(name = "is_active")
	private Short isActive = 1;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "sysFunctionGroup", fetch = FetchType.EAGER)
	@OrderBy("display_order ASC")
	private List<SysFunction> sysFunctions = null;
	
	public SysFunctionGroup() {
		super();
	}
	
	public SysFunctionGroup(Long functionGroupId, String code, String name, String description, String targetForm,
			String navigateUrl, String iconUrl, Short showMenu, Double displayOrder, Short isActive,
			List<SysFunction> sysFunctions) {
		super();
		this.functionGroupId = functionGroupId;
		this.code = code;
		this.name = name;
		this.description = description;
		this.targetForm = targetForm;
		this.navigateUrl = navigateUrl;
		this.iconUrl = iconUrl;
		this.showMenu = showMenu;
		this.displayOrder = displayOrder;
		this.isActive = isActive;
		this.sysFunctions = sysFunctions;
	}

	
	public Long getFunctionGroupId() {
		return functionGroupId;
	}
	public void setFunctionGroupId(Long functionGroupId) {
		this.functionGroupId = functionGroupId;
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
	

	public String getNavigateUrl() {
		return navigateUrl;
	}
	public void setNavigateUrl(String navigateUrl) {
		this.navigateUrl = navigateUrl;
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
	
	public List<SysFunction> getSysFunctions() {
		return sysFunctions;
	}
	public void setSysFunctions(List<SysFunction> sysFunctions) {
		this.sysFunctions = sysFunctions;
	}
}
