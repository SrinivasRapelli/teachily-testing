package com.teachily.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PricingPage {
	WebDriver driver;
	
	public PricingPage(WebDriver driver) {
		this.driver= driver;
	}
	
	By pricinglink = By.xpath("(//a[text()='Pricing'])[1]");
	By choosePlan = By.xpath("(//button[text()='Choose Plan'])[1]");
	By freeTrail = By.xpath("//*[text()='7-Day Trial']");
	By checkBox = By.xpath("//input");
	By proccedToPaymentButton = By.xpath("//*[text()=\"Proceed to Payment\"]");
	
	public void clickOnPricing() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(pricinglink));
		element.click();
	}
	public void readPlan() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(freeTrail));
		System.out.println(element.getText());
	}
	public void clickOnChoosePlan() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(choosePlan));
		element.click();
	}

	
	public void acceptThecheckbox() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(checkBox));
		element.click();
	}
	public void clickOnProceedToPayments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(proccedToPaymentButton));
		element.click();
	}
}
