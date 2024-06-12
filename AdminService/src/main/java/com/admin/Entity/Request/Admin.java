package com.admin.Entity.Request;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

import org.springframework.data.annotation.Id;

@Document
@Data
@AllArgsConstructor
public class Admin {
	@Id
	private String adminId;
	private String adminName;
	private String adminType;
	private String adminPassword;
}
