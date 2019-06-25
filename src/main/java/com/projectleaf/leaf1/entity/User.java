package com.projectleaf.leaf1.entity;

import lombok.Data;

@Data
public class User {
	private String id;
	private String name;
	private String surname;
	private String password;
	private boolean enabled;
}
