package com.teachily.SchoolAdminPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ResourcesPage {
	WebDriver driver;
	public ResourcesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By resourcesMenu = By.xpath("//*[text()=\"Resources\"]");
	By resourceCard = By.xpath("(//*[@class = \"block\"])[1]");
	By nameOfTheResource = By.xpath("//h1[text()=\"Longshore Drifts\"]");
	
	
	public void clickOnResourcesmenu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(resourcesMenu));
		element.click();
	}
	
	public void clickTheResourceCard() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(resourceCard));
		element.click();
	}
	
	public void verifyTheResourcePage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(nameOfTheResource));
		String nameOfResource = element.getText();
		Assert.assertEquals(nameOfResource, "Longshore Drifts");
		System.out.println(nameOfResource);
	}
	
}
