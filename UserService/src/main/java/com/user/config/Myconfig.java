package com.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import com.user.generateotp.OtpGenarator;

@Configuration
public class Myconfig {

	@Bean
    public JavaMailSender javaMailSender() {
        return new JavaMailSenderImpl();
    }
	@Bean
    public OtpGenarator otpGenarator() {
        return new OtpGenarator();
    }
}
