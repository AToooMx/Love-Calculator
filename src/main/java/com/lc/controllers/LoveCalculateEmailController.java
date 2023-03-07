package com.lc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lc.api.UserEmailDTO;
import com.lc.services.EmailServiceImpl;

@Controller
public class LoveCalculateEmailController {

	@Autowired
	private EmailServiceImpl emailServiceImpl;

	@RequestMapping("/send_result_to_email")
	public String showSendResultOnEmailPage(@ModelAttribute("userEmail") UserEmailDTO userEmail) {

		return "send-email-page";
	}

	@RequestMapping("/proccess_send_result")
	public String showConfirmSendResultPage(@Valid @ModelAttribute("userEmail") UserEmailDTO userEmail,
			BindingResult result, HttpServletRequest request) {

		if (result.hasErrors()) {
			return "send-email-page";
		}

		// Send email
		HttpSession session = request.getSession();
		String name = (String) session.getAttribute("userName");
		String resultCalculate = (String) session.getAttribute("resultCalculate");

		emailServiceImpl.sendEmail(userEmail.getEmail(), resultCalculate, name);

		return "proccess-email-page";
	}

}
