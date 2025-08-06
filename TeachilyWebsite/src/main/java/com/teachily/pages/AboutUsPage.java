package com.teachily.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutUsPage {
	WebDriver driver;
	public AboutUsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By aboutUslink = By.xpath("(//a[text()='About Us'])[1]");
	By heading = By.xpath("//h1");
	
	public void clickOnAbooutUs() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(aboutUslink));
		element.click();
	}
	
	public void readTheHeader() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(heading));
		System.out.println(element.getText());
	}
}
