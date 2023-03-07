package com.lc.api;

import java.util.Date;

import com.lc.annotations.Age;

public class UserRegistrationDto {
	private String name;
	private String userName;
	private char[] password;
	private Date date;
	@Age(lower = 18, upper = 60)
	private Integer age;
	private String country;
	private String gender;
	private String[] hobbies;

	private UserCommunicationDto userCommunicationDto;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public UserCommunicationDto getUserCommunicationDto() {
		return userCommunicationDto;
	}

	public void setUserCommunicationDto(UserCommunicationDto userCommunicationDto) {
		this.userCommunicationDto = userCommunicationDto;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


}
