package com.admin.Entity.Response;

import java.time.LocalDate;
import com.admin.Entity.Request.Admin;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AdminResponse {
	private LocalDate date;
	private String status;
	private Admin admin;	
}
