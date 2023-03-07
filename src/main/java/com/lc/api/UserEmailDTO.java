package com.lc.api;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class UserEmailDTO {

	@Email(message = "Email invalid format")
	@NotBlank(message = "{email.empty}")
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
