package com.user.model;

import lombok.Data;

@Data
public class ChangePasswordRequest {
    private User user;
    private String oldPassword;
    private String newPassword;
}

