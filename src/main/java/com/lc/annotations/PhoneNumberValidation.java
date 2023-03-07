package com.lc.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.lc.api.Phone;

public class PhoneNumberValidation implements ConstraintValidator<PhoneNumber, Phone> {

	@Override
	public void initialize(PhoneNumber constraintAnnotation) {

	}

	@Override
	public boolean isValid(Phone phone, ConstraintValidatorContext context) {
		
		if(phone == null) {
			return false;
		}
		
		if(phone.getUserNumber().length() < 10) {
			return false;
		}
		
		return true;
	}

}
