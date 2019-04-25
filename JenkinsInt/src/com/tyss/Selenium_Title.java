package com.tyss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_Title {
@Test
public void test() {
	System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.seleniumhq.org/");
	
String Title1 = driver.getTitle();
System.out.println(Title1);
driver.findElement(By.xpath("//a[@title='Get Selenium']")).click();
String Title2 = driver.getTitle();
System.out.println(Title2);
driver.quit();
}
}

