package com.testsol.fwk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebObject {

	WebDriver driver;
	public WebObject(String browserMode){
		System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		if(browserMode.equalsIgnoreCase("chrome"))
			driver=new ChromeDriver();
			else
			driver=new InternetExplorerDriver();
		System.out.println("Driver object is created with:"+browserMode);
	}
	public void click(String type,String locator){
		By by=null;
		if(type.equalsIgnoreCase("id"))
			by=By.id(locator);
		else if(type.equalsIgnoreCase("name"))
			by=By.name(locator);
		else if(type.equalsIgnoreCase("class"))
			by=By.className(locator);
		else if(type.equalsIgnoreCase("linkText"))
			by=By.linkText(locator);
		else if(type.equalsIgnoreCase("xpath"))
			by=By.xpath(locator);
		WebElement ele=driver.findElement(by);
		ele.click();
		System.out.println("Clicked on element identified by:"+locator);
	}
	public void sendKey(String type,String locator,String value){
		By by=null;
		if(type.equalsIgnoreCase("id"))
			by=By.id(locator);
		else if(type.equalsIgnoreCase("name"))
			by=By.name(locator);
		else if(type.equalsIgnoreCase("class"))
			by=By.className(locator);
		else if(type.equalsIgnoreCase("linkText"))
			by=By.linkText(locator);
		else if(type.equalsIgnoreCase("xpath"))
			by=By.xpath(locator);
		WebElement ele=driver.findElement(by);
		ele.sendKeys(value);
	}
	public void get(String url) {
		driver.get(url);
	}
	public void submit(String type,String locator){
		By by=null;
		if(type.equalsIgnoreCase("id"))
			by=By.id(locator);
		else if(type.equalsIgnoreCase("name"))
			by=By.name(locator);
		else if(type.equalsIgnoreCase("class"))
			by=By.className(locator);
		else if(type.equalsIgnoreCase("linkText"))
			by=By.linkText(locator);
		else if(type.equalsIgnoreCase("xpath"))
			by=By.xpath(locator);
		WebElement ele=driver.findElement(by);
		ele.submit();
	}
	
}
