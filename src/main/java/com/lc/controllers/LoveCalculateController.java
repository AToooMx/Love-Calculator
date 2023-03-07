package com.lc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lc.api.UserInfoDto;
import com.lc.services.ResultCalculate;

@Controller
public class LoveCalculateController {

	@Autowired
	private ResultCalculate resultCalculate;

	@RequestMapping("/")
	public String getHomePage(@ModelAttribute("userInfo") UserInfoDto userInfoDto, HttpServletRequest request) {

		HttpSession session = request.getSession();
		String userName = (String) session.getAttribute("userName");
		userInfoDto.setUserName(userName);

		return "home-page";
	}

	@RequestMapping("/calculate")
	public String getCalculatePage(@Valid @ModelAttribute("userInfo") UserInfoDto userInfoDto, BindingResult result,
			HttpServletRequest request) {

		if (result.hasErrors()) {
			System.out.println("Some errors?");
			return "home-page";
		}

		String userName = userInfoDto.getUserName();
		String crushName = userInfoDto.getCrushName();
		userInfoDto.setResult(resultCalculate.calculateLove(userName, crushName));

		HttpSession session = request.getSession();
		session.setAttribute("userName", userInfoDto.getUserName());
		session.setAttribute("resultCalculate", userInfoDto.getResult());

		return "calculate-page";
	}

}
