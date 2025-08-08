package com.teachily.SchoolAdminPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;

public class ProfilePage {
	WebDriver driver;
	
	public ProfilePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By profile = By.xpath("//*[text()='IMPERIAL SCHOOL']");
	By header = By.xpath("//*[text()='My Profile']");
	
	public void clickOnProfile() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(profile));
		element.click();
	}
	
	public void checkProfilePage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(header));
		String heading = element.getText();
		Assert.assertEquals(heading, "My Profile");
		System.out.println(heading);
	}
}
