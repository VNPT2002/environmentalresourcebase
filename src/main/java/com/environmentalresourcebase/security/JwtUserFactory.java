package com.environmentalresourcebase.security;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.environmentalresourcebase.model.SysRole;
import com.environmentalresourcebase.model.SysUser;


public final class JwtUserFactory {
	private JwtUserFactory() {
	}

	public static JwtUser create(SysUser sysUser) {
		Boolean enable = sysUser.getIsActive()==1; 
		return new JwtUser(
				sysUser.getUserId(),
				sysUser.getUsername(), 
				sysUser.getFullName(),
				sysUser.getCompanyEmail(), 
				sysUser.getPassword(), 
				mapToGrantedAuthorities(sysUser.getSysRoles()),
				enable,
				sysUser.getLastPasswordResetDate());
	}

	private static List<GrantedAuthority> mapToGrantedAuthorities(Set<SysRole> authorities) {
		return authorities.stream()
				.map(authority -> new SimpleGrantedAuthority(authority.getCode()))
				.collect(Collectors.toList());
	}
}
