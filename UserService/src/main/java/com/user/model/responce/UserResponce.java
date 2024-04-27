package com.user.model.responce;

import java.time.LocalDate;
import com.user.model.User;
import lombok.Data;

@Data
public class UserResponce {

	public UserResponce(LocalDate createdOn, String status, User user) {
		this.createdOn = createdOn;
		this.status = status;
		this.user = user;
	}
	private LocalDate createdOn;
	private String status;
	private User user;
}
