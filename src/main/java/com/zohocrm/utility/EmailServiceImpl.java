package com.zohocrm.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;

@Controller
public class EmailServiceImpl implements EmailService{
	
	@Autowired
	private JavaMailSender emailSender;
	
	@Override
	public void sendSimpleMassage(String to,String subject,String text) {
		
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(to);
		message.setSubject(subject);
		message.setText(text);
		emailSender.send(message);
	}

}
