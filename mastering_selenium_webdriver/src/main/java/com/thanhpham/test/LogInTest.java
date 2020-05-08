package com.thanhpham.test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInTest {
	
	@Test
	public void logInTest() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/login");
		System.out.println("Page opened");
		driver.quit();
	}
}