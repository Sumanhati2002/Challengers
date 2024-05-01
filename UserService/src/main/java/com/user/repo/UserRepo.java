package com.user.repo;

import org.springframework.data.repository.CrudRepository;

import com.user.model.User;

public interface UserRepo extends CrudRepository<User, String>{

	public User findByEmail(String email);
}
