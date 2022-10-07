package com.test_a;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Pageobject.Signuppom;
import com.Pageobject.loginpom;
import com.utility.Baseclasss;

import config.properties.Liabrary;

public class Test_1 extends Baseclasss {
	//loginpom login=PageFactory.initElements(driver, loginpom.class);
	//Signuppom signup=PageFactory.initElements(driver, Signuppom.class);
	loginpom login;
	Signuppom signup;
	
	@Test
	public void tc01() throws Exception {
		
		login=PageFactory.initElements(driver, loginpom.class);
		Liabrary.Custom_sendkeys(login.getTxt_email(), excel.getStringData("Sheet1", 0, 0));
		Liabrary.Custom_sendkeys(login.getTxt_passw(), excel.getStringData("Sheet1", 0, 1));
		Liabrary.Custom_click(login.getBtn_login());	
		
		Liabrary.Custom_Screenshot(driver);
		//Liabrary.Custom_click(login.getLnk_signupfb());
	}
	@Test
	public void tc02() throws Exception  {
		Thread.sleep(2000);
		Liabrary.Custom_click(login.getLnk_signupfb());
		Thread.sleep(2000);
		signup=PageFactory.initElements(driver, Signuppom.class);
		//Liabrary.Custom_click(login.getLnk_signupfb());
		Liabrary.Custom_sendkeys(signup.getTxt_firstname(), excel.getStringData("Sheet1", 1, 0));
		Liabrary.Custom_sendkeys(signup.getTxt_lastname(), excel.getStringData("Sheet1", 1, 1));
		
	}
}
