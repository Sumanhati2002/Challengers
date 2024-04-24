package com.admin.Service.Impl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.Entity.Request.Admin;
import com.admin.Entity.Response.AdminResponse;
import com.admin.Service.AdminService;

@Service
public class AdminServiceImpl {
	@Autowired
    private AdminService repository;

	
	public AdminResponse createAdmin(Admin admin) {
		return new AdminResponse(LocalDate.now(),"sucess",repository.save(admin));
	}

}
