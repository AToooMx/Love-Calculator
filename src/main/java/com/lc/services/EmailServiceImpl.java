package com.lc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

	@Autowired
	private JavaMailSender mailSender;
	
	@Override
	public void sendEmail(String userEmail, String result, String name) {
		
		SimpleMailMessage newMail = new SimpleMailMessage();
		newMail.setTo(userEmail);
		newMail.setSubject("Love Calculator Application Result");
		
		String text = "Hi " + name + ".\nThe result predicted by the Love Calculator Application is " + result;
		
		newMail.setText(text);
		
		mailSender.send(newMail);
		
	}

}
