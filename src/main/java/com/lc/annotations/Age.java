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
@Constraint(validatedBy = AgeValidator.class)
public @interface Age {

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	String message() default "{age.InvalidValue}";

	int lower() default 18;

	int upper() default 35;

}
