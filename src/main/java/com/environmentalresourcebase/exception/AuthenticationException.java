package com.environmentalresourcebase.exception;

public class AuthenticationException extends RuntimeException {	
	private static final long serialVersionUID = 2013748078257152175L;
	public AuthenticationException(String message, Throwable cause) {
        super(message, cause);    
    }
}
