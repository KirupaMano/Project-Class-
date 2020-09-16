package org.firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
public static void main(String args[]) {
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kirupa\\eclipse-workspace\\Mock\\Driver\\geckodriver.exe");

WebDriver webFire = new FirefoxDriver();

webFire.get("http://www.greenstechnologys.com/");
}
}
