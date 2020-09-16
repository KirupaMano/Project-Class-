package org.internet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Kirupa\\eclipse-workspace\\Mock\\Driver\\IEDriverServer.exe");
		
	WebDriver webIe = new InternetExplorerDriver();
	webIe.get("http://www.greenstechnologys.com/");
	
	}

}
