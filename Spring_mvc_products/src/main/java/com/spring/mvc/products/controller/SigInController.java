package com.spring.mvc.products.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.mvc.products.dao.UserSerivceDao;

@Controller
public class SigInController {
	
	// we need to inject our UserSerivceDao in our SigInController
	
	// injection of UserSerivceDao
	@Autowired
	private UserSerivceDao userSerivceDao;

	// take us to sign in page
	@GetMapping({"/takeMetoSignInPage", "/"})
	public String showSignInPage() {
		
		
		return "signInScreen";
	}
	
	
	// let us to sign in
	@PostMapping("/signIn")
	public String ShowWecomeScreen(HttpServletRequest req) {
		String username = req.getParameter("username");
		String password = req.getParameter("pwd");
		
		 if(userSerivceDao.checkUserNameAndPassword(username, password)) {
			 return "WelcomeScreen";
			 
		 } else {
			 
			 req.setAttribute("errorMessage", "username or password is not correct please try again");
			 
			 return "signInScreen";
			 
		 }
	}
	
	
	
	
	
	
	
	
	
	
}
