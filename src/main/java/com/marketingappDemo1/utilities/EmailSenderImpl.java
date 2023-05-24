package com.marketingappDemo1.utilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.SimpleMailMessage;


@Component
public class EmailSenderImpl implements EmailSender {
	
	
	@Autowired
	private JavaMailSender MailSender;

	@Override
	public void sendEmail(String to, String sub, String msg) {
		
		SimpleMailMessage Message
        = new SimpleMailMessage();
		
		Message.setTo(to);
		Message.setSubject(sub);
		Message.setText(msg);
		MailSender.send(Message);
		

	}

}
