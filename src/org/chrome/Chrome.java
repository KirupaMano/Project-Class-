package org.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kirupa\\eclipse-workspace\\Mock\\Driver\\chromedriver.exe");
		
		WebDriver webChrome = new ChromeDriver();
		webChrome.get("http://www.greenstechnologys.com/");	
	}
}
