package com.democyclospages;

import org.openqa.selenium.By;

import com.democyclosbase.DemoCyclosBase;

public class PersonalDetailPage extends DemoCyclosBase{
	
	public static By personalBtn = By.xpath("//div[@class='personal-label']");
	
	public static void personalbutton() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(personalBtn).click();
		
	}

	

}
