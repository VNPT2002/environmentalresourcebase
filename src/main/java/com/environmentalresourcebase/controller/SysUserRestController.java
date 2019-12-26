package com.environmentalresourcebase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.environmentalresourcebase.repository.SysUserRepository;
import com.environmentalresourcebase.model.SysUser;

@RestController
@RequestMapping("/api/sysusers")
public class SysUserRestController {
	@Autowired
	SysUserRepository sysUserRepository;
	
	@GetMapping
	public List<SysUser> getAllUsers(){
		return sysUserRepository.findAll();
	}
}
