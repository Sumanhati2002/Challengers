package com.admin.Service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.admin.Entity.Request.Admin;

public interface AdminService extends MongoRepository<Admin, String> {
}