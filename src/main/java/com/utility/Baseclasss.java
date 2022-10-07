package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import config.properties.Exceldataprovider;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclasss {
	
	public static WebDriver driver;
	public static Exceldataprovider excel;
	public static Configdataprovider config;
	
	@BeforeSuite
	public void bs() throws Exception {
		excel=new Exceldataprovider();
		config=new Configdataprovider();
	}
	
	@Parameters({"BrowserName"})
	@BeforeMethod
	public void setup(String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();

		}
		driver.get(config.GetBaseUrl_QA2());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
	}

	
	@AfterMethod
	public void am() {
		driver.close();
	}
}
