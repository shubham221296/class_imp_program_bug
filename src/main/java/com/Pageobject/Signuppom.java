package com.Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Signuppom {
	
	
	@FindBy(how=How.XPATH,using="//input[@name='firstname']") private WebElement txt_firstname;
	@FindBy(how=How.XPATH,using="//input[@name='lastname']") private WebElement txt_lastname;
	
	
	public WebElement getTxt_firstname() {
		return txt_firstname;
	}
	
	public WebElement getTxt_lastname() {
		return txt_lastname;
	}
	
	
}
