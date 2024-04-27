package com.user.generateotp;

import java.util.Random;

public class OtpGenarator {

	private static final int OTP_LENGTH = 6;

    public static String generateOTP() {
        Random random = new Random();
        StringBuilder otp = new StringBuilder();

        for (int i = 0; i < OTP_LENGTH; i++) {
            otp.append(random.nextInt(10));
        }

        return otp.toString();
    }
	public static void main(String[] args) {
		OtpGenarator oeGenarator=new OtpGenarator();
		OtpGenarator.generateOTP();
	}
}
