package com.democyclospages;

import org.openqa.selenium.By;

import com.democyclosbase.DemoCyclosBase;

//Inherit the base class

public class LoginPage extends DemoCyclosBase {
	
	public static By LoginBtn = By.xpath("//a[@id='login-link']");
	public static By userNameTxt = By.xpath("//input[@type='text']");
	public static By passwordTxt = By.xpath("//input[@type='password']");
	public static By submitBtn = By.xpath("//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary btn-action-primary']");
	
	public static void login(String userName, String passWord) throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(LoginBtn).click();
		driver.findElement(userNameTxt).sendKeys(userName);
		driver.findElement(passwordTxt).sendKeys(passWord);
		driver.findElement(submitBtn).click();
		
	}

}