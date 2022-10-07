package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configdataprovider {

	Properties pro;
	
	public Configdataprovider() throws Exception {
		String configpath="C:\\Users\\shubh\\eclipse-workspace\\framework_sample\\Config\\config.properties";
		FileInputStream file1=new FileInputStream(configpath) ;
		 pro =new Properties();
		 pro.load(file1);
		}
	
	public String GetBaseUrl_QA1() {
		return pro.getProperty("BaseUrl_QA1");
	}
	public String GetBaseUrl_QA2() {
		return pro.getProperty("BaseUrl_QA2");
	}
	public String GetBaseUrl_QA3() {
		return pro.getProperty("BaseUrl_QA3");
	}
	
}	

