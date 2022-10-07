package config.properties;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

import net.bytebuddy.utility.RandomString;

public class Liabrary {
	
	public static ExtentTest test;
	
	public static void Custom_sendkeys(WebElement element,String value) {
		try {
		element.sendKeys(value);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void Custom_click(WebElement Element) {
	try {
		Element.click();
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}	
	}
	public static void Handle_DropDown(WebElement Element,String text) {
	try {
		Select sel=new Select(Element);
		sel.selectByVisibleText(text);
	}catch(Exception e){
		System.out.println(e.getMessage());
	}
	}
	public static void Custom_MouseMovement(WebDriver driver,WebElement element) {
		try {
		Actions act1=new Actions(driver);
		act1.moveToElement(element).click().build().perform();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			}	
	}
	public static void Custom_Screenshot(WebDriver driver) throws Exception {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File from=ts.getScreenshotAs(OutputType.FILE);
		String rm=RandomString.make(4);
		File Where=new File("C:\\Users\\shubh\\eclipse-workspace\\framework_sample\\Screenshot\\"+rm+".png");
		FileUtils.copyFile(from, Where);
	}
	public static Alert Custom_handleAlert(WebDriver driver) {
		Alert alt=driver.switchTo().alert();
		return alt;
	}
}
