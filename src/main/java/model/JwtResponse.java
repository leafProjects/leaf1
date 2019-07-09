package model;

import java.io.Serializable;

public class JwtResponse implements Serializable {

	private static final long serialVersionUID = -5387419985918772129L;
	private final String jwttoken;

	public JwtResponse(String jwttoken) {
		this.jwttoken = jwttoken;
	}

	public String getToken() {
		return this.jwttoken;
	}
}