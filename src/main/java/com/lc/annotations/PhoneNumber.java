package com.lc.annotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Documented
@Constraint(validatedBy = PhoneNumberValidation.class)
public @interface PhoneNumber {

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	String message() default "{phone.InvalidValue}";
	
}
