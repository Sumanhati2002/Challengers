package com.admin.Entity.Request;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document
public class Admin {
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminType() {
		return adminType;
	}
	public void setAdminType(String adminType) {
		this.adminType = adminType;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public Admin(String adminId, String adminName, String adminType, String adminPassword) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminType = adminType;
		this.adminPassword = adminPassword;
	}
	@Id
	private String adminId;
	private String adminName;
	private String adminType;
	private String adminPassword;
}
