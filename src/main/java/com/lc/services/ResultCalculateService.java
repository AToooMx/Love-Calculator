package com.lc.services;

import org.springframework.stereotype.Service;

@Service
public class ResultCalculateService implements ResultCalculate {

	@Override
	public String calculateLove(String userName, String crushName) {

		int countNumber = userName.length() + crushName.length();

		switch (countNumber % 5) {
		case 0:
			return "Friend";
		case 1:
			return "Love";
		case 2:
			return "Affection";
		case 3:
			return "Marriage";
		case 4:
			return "Enemy";
		}

		return "Error";
	}

}
