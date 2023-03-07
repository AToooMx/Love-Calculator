package com.lc.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lc.api.UserRegistrationDto;
import com.lc.editors.NamePropertyEditor;
import com.lc.formatters.PhoneNumberFormatter;
import com.lc.validators.EmailValidator;
import com.lc.validators.UserNameValidator;

@Controller
public class LoveCalculateRegisterController {

	@RequestMapping("/register")
	public String getRegisterPage(@ModelAttribute("userReg") UserRegistrationDto user) {

		return "register-page";
	}

	@RequestMapping("/submitRegistrationForm")
	public String getSubmitForm(@Valid @ModelAttribute("userReg") UserRegistrationDto user, BindingResult result) {

		if (result.hasErrors()) {
			System.err.println(result);
			return "register-page";
		}

		return "confirmation-registration-page";
	}

	@InitBinder
	public void initBiner(WebDataBinder binder) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		CustomDateEditor dateEditor = new CustomDateEditor(dateFormat, true);
		binder.registerCustomEditor(Date.class, "date", dateEditor);

		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, "name", editor);

		NamePropertyEditor nameEditor = new NamePropertyEditor();
		binder.registerCustomEditor(String.class, "name", nameEditor);

		binder.addValidators(new EmailValidator());
		binder.addValidators(new UserNameValidator());

		binder.addCustomFormatter(new PhoneNumberFormatter());
	}
}
