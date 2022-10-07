package com.Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginpom {
	
	@FindBy(how=How.XPATH,using="//input[@name='email']") private WebElement txt_email;
	@FindBy(how=How.XPATH,using="//input[@name='pass']") private WebElement txt_passw;
	@FindBy(how=How.XPATH,using="//a[text()='Forgotten account?']") private WebElement lnk_forgetpass;
	@FindBy(how=How.XPATH,using="//a[text()='Sign up for Facebook']") private WebElement lnk_signupfb;
	@FindBy(how=How.XPATH,using="//button[@name='login']") private WebElement btn_login;
	
	public WebElement getTxt_email() {
		return txt_email;
	}
	
	public WebElement getTxt_passw() {
		return txt_passw;
	}
	
	public WebElement getLnk_forgetpass() {
		return lnk_forgetpass;
	}
	
	public WebElement getLnk_signupfb() {
		return lnk_signupfb;
	}
	
	public WebElement getBtn_login() {
		return btn_login;
	}
	

	
}
