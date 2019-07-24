package com.projectleaf.leaf1.repository;

import com.projectleaf.leaf1.entity.Tea;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeaRepository extends MongoRepository<Tea, String> {
	
	@Override
    void delete(Tea deleted);
}