package com.lc.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.lc.api.UserRegistrationDto;

public class UserNameValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return UserRegistrationDto.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "userName.empty");
		
		String userName = ((UserRegistrationDto)target).getUserName();
		
		if(!userName.contains("_")) {
			errors.rejectValue("userName", "userName.invalidString");
		}
		
	}

}
