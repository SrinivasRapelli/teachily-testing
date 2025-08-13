package com.teachily.teacherDashboardPages;

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
	
	By resourcesMenu = By.xpath("//span[text()=\"Resources\"]");
	By resource = By.xpath("//h4[text()=\"Longshore Drifts.pptx\"]");
	By resourceTitle = By.xpath("//h1[text()='Longshore Drifts']");
	By description = By.xpath("//*[contains(text(),'longshore drift,')]");
	
	public void clickonResourceMenu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(resourcesMenu));
		element.click();
	}
	
	public void clickonAResource() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(resource));
		element.click();
	}
	
	public void verifyTheResourceTitle() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(resourceTitle));
		String verifyTitle = element.getText();
		Assert.assertEquals(verifyTitle, "Longshore Drifts");
		System.out.println(verifyTitle);
	}
	
	public void verifyResourceDescription() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(description));
		String descriptionOfResource = element.getText();
		Assert.assertEquals(descriptionOfResource , "This animation demonstrates the process of longshore drift, showing how it alters coastlines.");
		System.out.println(descriptionOfResource);
	}
	
}
