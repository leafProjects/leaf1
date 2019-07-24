package com.projectleaf.leaf1.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "products")
public class Tea {

	@Id
    private String id;
	private String name;
	private String description;
	private Double price;
	private String image;
}