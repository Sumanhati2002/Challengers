package com.user.service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.user.model.User;
import com.user.model.responce.UserResponce;
import com.user.repo.UserRepo;
import com.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserResponce createUser(User user) {

		return new UserResponce(LocalDate.now(),"sucess", userRepo.save(user));
	}

	@Override
	public User getUserById(String userId) {

		Optional<User> optionaluser=userRepo.findById(userId);
		return optionaluser.get();
	}

	@Override
	public List<User> getAllUsers() {
		
		return (List<User>) userRepo.findAll();
	}

	@Override
	public User updateUser(User user) {
		
		User existingUser=userRepo.findById(user.getId()).get();
		existingUser.setFirstName(user.getFirstName());
		existingUser.setLastName(user.getLastName());
		existingUser.setEmail(user.getEmail());
		User updateUser=userRepo.save(existingUser);
		return updateUser;
	}

	@Override
	public void deleteUser(String userId) {
		
		userRepo.deleteById(userId);
	}

}
