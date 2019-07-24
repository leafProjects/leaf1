package com.projectleaf.leaf1.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "roles")
public class Role {

	@Id
    private String id;
    @Indexed(unique = true, direction = IndexDirection.DESCENDING)
    private String role;
}