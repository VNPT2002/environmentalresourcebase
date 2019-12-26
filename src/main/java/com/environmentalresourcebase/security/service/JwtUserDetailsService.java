package com.environmentalresourcebase.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.environmentalresourcebase.model.SysUser;
import com.environmentalresourcebase.repository.SysUserRepository;
import com.environmentalresourcebase.security.JwtUserFactory;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	private SysUserRepository sysUserRepository;
	  
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		SysUser user = sysUserRepository.findByUsername(username);
		 if (user == null) {
	            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
	     }else {
	    	 return JwtUserFactory.create(user);
	     }
	}

}
