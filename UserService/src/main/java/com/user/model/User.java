package com.user.model;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@org.springframework.data.annotation.Id
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	
	private String phoneNumber;
	private String password;
}
