package com.projectleaf.leaf1.entity;

import java.util.Collection;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

@Getter
@Setter
@EqualsAndHashCode
public class LeafUser extends User {

	private String id;
	private String name;
	private String surname;


	public LeafUser(String username, String password, Collection<? extends GrantedAuthority> authorities, String id, String name, String surname) {
		super(username, password, authorities);
		this.id = id;
		this.name = name;
		this.surname = surname;
	}

	public LeafUser(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked,
		Collection<? extends GrantedAuthority> authorities, String id, String name, String surname) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
		this.id = id;
		this.name = name;
		this.surname = surname;
	}
}
