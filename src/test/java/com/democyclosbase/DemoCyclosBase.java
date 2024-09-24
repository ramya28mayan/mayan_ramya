package com.democyclosbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCyclosBase {
	
	
	public static WebDriver driver;
	
	public static void democyclosURL() {
		
		driver = new ChromeDriver();
		driver.get("https://demo.cyclos.org/ui/home");
		driver.manage().window().maximize();
	}

}
