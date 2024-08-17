package com.zohocrm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.utility.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	
     @RequestMapping("/compose")
	public String composeEmail(@RequestParam("emailId")String email,ModelMap model) {
    	 model.addAttribute("email", email);
    	 return"compose_email";
     }
     
     @RequestMapping("/sendEmail")
     public String sendEmail(@RequestParam("to") String to,@RequestParam("subject")String subject,@RequestParam("body")String body) {
    	 emailService.sendSimpleMassage(to, subject, body);
    	 return"compose_email";
     }
}
