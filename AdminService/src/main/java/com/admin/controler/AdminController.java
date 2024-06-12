package com.admin.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.admin.Entity.Request.Admin;
import com.admin.Entity.Response.AdminResponse;
import com.admin.Service.Impl.AdminServiceImpl;

@RestController
public class AdminController {
	@Autowired
	private AdminServiceImpl adminServiceImpl;
	@PostMapping(path = "/createAdmin", produces = MediaType.APPLICATION_JSON_VALUE)
	public AdminResponse createAdmin(@RequestBody Admin admin) {
		return adminServiceImpl.createAdmin(admin);
	}
	@PostMapping(path = "/authorize-user", produces = MediaType.APPLICATION_JSON_VALUE)
	public AdminResponse AuthorizeUsers(@RequestBody Admin admin) {
		return adminServiceImpl.createAdmin(admin);
	}
}
