package com.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Size;

public class UserInfoDto {
	@Size(min = 3, max = 15, message = "Invalid value. Crush name should be between 3-15")
	private String userName;
	@Size(min = 3, max = 15, message = "Invalid value. Crush name should be between 3-15")
	private String crushName;

	@AssertTrue(message = "You have to agree to use our app")
	private boolean isChecked;
	private String result;

	public UserInfoDto() {
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

	public boolean getIsChecked() {
		return isChecked;
	}

	public void setIsChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}

	@Override
	public String toString() {
		return "UserInfoDto [userName=" + userName + ", crushName=" + crushName + ", isChecked=" + isChecked + "]";
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
