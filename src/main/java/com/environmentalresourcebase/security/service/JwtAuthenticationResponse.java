package com.environmentalresourcebase.security.service;

import java.io.Serializable;

import com.environmentalresourcebase.security.JwtUser;

public class JwtAuthenticationResponse implements Serializable {

    private static final long serialVersionUID = 1250166508152483573L;

    private final String token;
    private final JwtUser user;

    public JwtAuthenticationResponse(String token, JwtUser user) {
        this.token = token;
        this.user =user;
    }

    public String getToken() {
        return this.token;
    }

	public JwtUser getUser() {
		return user;
	}
}
