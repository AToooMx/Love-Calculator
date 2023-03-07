package com.lc.formatters;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.lc.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone object, Locale locale) {

		return object.getCountryCode() + "-" + object.getUserNumber();
	}

	@Override
	public Phone parse(String text, Locale locale) throws ParseException {

		Phone phone = new Phone();
		String[] phoneNumber = text.split("-");
		System.out.println(text);
		if (text.indexOf("-") == -1 || text.indexOf("-") == 0) {
			phone.setCountryCode("380");

			if(text.indexOf("-") == 0) {
				phone.setUserNumber(phoneNumber[1]);
			}else {
				phone.setUserNumber(phoneNumber[0]);
			}
			
		}else {
			phone.setCountryCode(phoneNumber[0]);
			phone.setUserNumber(phoneNumber[1]);
		}

		return phone;
	}

}
