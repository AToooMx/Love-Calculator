package com.lc.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.lc.api.UserRegistrationDto;

@Component
public class EmailValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {

		return UserRegistrationDto.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userCommunicationDto.email", "email.empty");
		
		String email = ((UserRegistrationDto)target).getUserCommunicationDto().getEmail();
		
		if(!email.endsWith("@gmail.com")) {
			errors.rejectValue("userCommunicationDto.email", "email.invalidDomen");
		}
	}

}
