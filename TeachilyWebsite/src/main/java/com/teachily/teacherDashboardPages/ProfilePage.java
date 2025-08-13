package com.teachily.teacherDashboardPages;

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
	
	By profileLogo = By.xpath("//a[@href='/profile']");
	By myProfile = By.xpath(" //*[text()=\"My Profile\"]");
	
	public void clickOnProfileIcon() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(profileLogo));
		element.click();
	}
	
	public void verifyTheProfilePage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(myProfile));
		String profile = element.getText();
		Assert.assertEquals(profile, "My Profile");
		System.out.println(profile);
	}
	
	
	
	

}
