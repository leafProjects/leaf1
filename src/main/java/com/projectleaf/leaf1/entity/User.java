package com.projectleaf.leaf1.entity;

import lombok.Data;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")
public class User {

	@Id
	private String id;
	@Indexed(unique = true, direction = IndexDirection.DESCENDING)
	private String email;
	private String password;
	private String name;
	private String surname;
	private boolean enabled;
	@DBRef
	private Set<Role> roles;
}
