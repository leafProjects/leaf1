package com.projectleaf.leaf1.repository;

import com.projectleaf.leaf1.entity.LeafUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<LeafUser, String> {
	LeafUser findByUsername(String username);
}
