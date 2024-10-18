package com.shopEase.response;

import lombok.Data;

@Data
public class AuthResponse {
	
	private String jwt;
	
	private boolean status;
	
	public AuthResponse() {
		// TODO Auto-generated constructor stub
	}

	public AuthResponse(String jwt, boolean status) {
		super();
		this.jwt = jwt;
		this.status = status;
	}
}