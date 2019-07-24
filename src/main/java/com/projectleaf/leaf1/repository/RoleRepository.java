package com.projectleaf.leaf1.repository;

import com.projectleaf.leaf1.entity.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends MongoRepository<Role, String> {
	Role findByRole(String role);
}