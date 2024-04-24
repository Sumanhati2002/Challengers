package com.admin.Entity.Response;

import java.time.LocalDate;
import com.admin.Entity.Request.Admin;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AdminResponse {
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public AdminResponse(LocalDate localDate, String status, Admin admin) {
		super();
		this.date = localDate;
		this.status = status;
		this.admin = admin;
	}
	private LocalDate date;
	private String status;
	private Admin admin;
	
	
}
