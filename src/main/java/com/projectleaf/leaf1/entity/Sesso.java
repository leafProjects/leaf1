package com.projectleaf.leaf1.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Sesso {

	@JsonProperty("M")
	MASCHIO,
	@JsonProperty("F")
	FEMMINA;
}
