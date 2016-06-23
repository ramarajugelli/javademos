package com.testsol.testScripts;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.testsol.fwk.WebObject;

public class Demo {

	public static void main(String[] args) {
		WebObject wb=new WebObject("chrome");
		wb.get("http://www.google.com");
		wb.sendKey("name", "q", "Hello world");
		wb.submit("name", "q");
//		wb.click("id", "");

	}
	

}
